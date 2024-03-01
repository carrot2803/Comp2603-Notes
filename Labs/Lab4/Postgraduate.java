public class Postgraduate extends Student {
    private String supervisor;
    private String thesisTitle;
    private String status;

    public Postgraduate(String name, String supervisor, String thesisTitle) {
        super(name);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
        setStatus(status);
    }

    public void setStatus(String status) {
        this.status = status != null ? status : "full-time";
    }

    public void calculateFees() {
        double fees = (status == "full-time") ? 2650.00 : 1325.00;
        super.setFees(fees);
    }

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
}
