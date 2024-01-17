public class Bill {
    private static int billCounter = 0;
    private String billNumber;
    private double amount;
    private String type;
    private boolean paid;

    public Bill(String type, double amount, boolean paid) {
        this.billNumber = "" + billCounter++;
        this.type = type;
        this.amount = amount;
        this.paid = paid;
    }

    // mutators
    public void setPaid(boolean b) {
        this.paid = true;
    }

    // accessors
    public String getBillNumber() {
        return this.billNumber;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getType() {
        return this.type;
    }

    public boolean getPaid() {
        return this.paid;
    }

}