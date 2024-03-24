public class Bill implements Comparable<Object> {
    private static int billCount = 1000;
    private String billNumber;
    private double amount;
    private String type;
    private boolean paid;

    // Constructor
    public Bill(String type, double amount, boolean paid) {
        this.type = type;
        this.amount = amount;
        this.paid = paid;
        this.billNumber = String.valueOf(billCount++);
    }

    // Accessors
    public String getBillNumber() {
        return this.billNumber;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getType() {
        return this.type;
    }

    public boolean checkPaid() {
        return this.paid;
    }

    // Methods
    public int compareTo(Object object) {
        if (!(object instanceof Bill))
            throw new ClassCastException("Object must be of type Bill");
        Bill bill = (Bill) object;
        return this.billNumber.compareTo(bill.getBillNumber());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Bill))
            return false;
        Bill bill = (Bill) obj;
        return this.billNumber == bill.getBillNumber();
    }

    public int hashCode() {
        return this.billNumber.hashCode();
    }

    public String toString() {
        String paid = this.paid ? "PAID" : "UNPAID";
        return this.billNumber + " " + this.type + " $" + this.amount + " " + paid;
    }

}
