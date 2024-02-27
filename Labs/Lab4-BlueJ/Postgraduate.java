public class Postgraduate extends Student{
    private String supervisor;
    private String thesisTitle;
    private String status;
    
    public Postgraduate(String name, String supervisor, String thesisTitle){
        super(name);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
        setStatus(status);
    }
    
    public void setStatus(String status){
        if(status == null)
            status = "full-time";
        else
            status = "part-time";
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
    
    public void calculateFees() {
        double fees = (status == "full-time") ? 2650 : 1325;
        setFees(fees);
    }
    
    public String toString() {
        return super.toString() + " " + getSupervisor() + " " + getThesisTitle();
    }
}