public class Bill {
    private static int billCount = 1000;
    private String billNumber;
    private double amount;
    private String type;
    private boolean paid;

    public Bill(String type, double amount, boolean paid) {
        this.type = type;
        this.amount = amount;
        this.paid = paid;
        this.billNumber = String.valueOf(billCount++);
    }

    public String getBillNumber() {
        return this.billNumber;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getType() {
        return this.type;
    }

    public boolean isPaid() {
        return this.paid;
    }

    public String toString() {
        String paid = this.paid ? "PAID" : "UNPAID";
        return this.billNumber + " " + this.type + " $" + this.amount + " " + paid;
    }

}
