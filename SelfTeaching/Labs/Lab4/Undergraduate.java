public class Undergraduate extends Student {
    private int credits;
    private String major;
    private String minor;

    public Undergraduate() {
        super();
    }

    // mutators
    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // accessors
    public int getCredits() {
        return credits;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    @Override
    public String toString() {
        return super.toString() + " Major: " + getMajor() + " Minor: " + getMinor() + " Credits: " + getCredits();
    }

    public void calculateFees() {
        double creditCost = 200.00;
        double tuitionFees = credits * creditCost;
        setFees(tuitionFees);
    }

}