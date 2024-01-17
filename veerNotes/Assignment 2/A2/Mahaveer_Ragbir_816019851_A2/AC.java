public class AC implements Device {
    private String ID;
    private static int IDcount = 1;
    private boolean on;
    
    public AC () {
        this.ID = "AC" + IDcount;
        IDcount++;
        this.on = false;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public boolean isPortable (){
        return false;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public void turnOn() {
        this.on = true;
        //System.out.println("AC " + id + " turned on");
    }
    
    public void turnOff() {
        this.on = false;
        //System.out.println("AC " + id + " turned off");
    }
    
    public boolean isBreezy() {
        return false;
    }
    
    public boolean isNoisy(){
        return false;
    }
    
    public int coolsBy() {
        return 5;
    }
    
    public int getBreeziness() {
        return 0;
    }
    
    public int getNoisiness() {
        return 0;
    }
}
