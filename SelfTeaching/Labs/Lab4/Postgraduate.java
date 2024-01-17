public class Postgraduate extends Student {
    private String supervisor;
    private String thesisTitle;
    private String status;

    public Postgraduate(String name, String supervisor, String thesisTitle) {
        super();
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
        this.status = "full-time";
    }

    // mutators
    public void setStatus(String status) {
        this.status = status;
    }

    // accessors
    public String getStatus() {
        return this.status;
    }

    public String getSupervisor() {
        return this.supervisor;
    }

    public String getThesisTitle() {
        return this.thesisTitle;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getSupervisor() + " " + getThesisTitle();
    }

    public void calculateFees() {
        double fees = (status == "full-time") ? 2650 : 1325;
        setFees(fees);
    }
}
