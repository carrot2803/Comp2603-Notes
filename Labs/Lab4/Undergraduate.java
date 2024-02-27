public class Undergraduate extends Student {
    private String major;
    private String minor;
    private int credits;

    public Undergraduate() {
        super();
        this.major = "";
        this.minor = "";
        this.credits = 0;
    }

    public String getMajor() {
        return this.major;
    }

    public String getMinor() {
        return this.minor;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void calculateFees() {
        final double costPerCredit = 200.00;
        double tuitionFees = credits * costPerCredit;
        setFees(tuitionFees);
    }

    public String toString() {
        return super.toString() + " MAJOR: " + this.major +
                " MINOR: " + this.minor + " CREDITS: "
                + this.credits;
    }
}