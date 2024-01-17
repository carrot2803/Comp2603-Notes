public final class StandingFan extends Fan implements PortableDevice, Device {
    private String ID;
    private static int sfanID = 1;
    private boolean on;
    
    public StandingFan() {
        super(0);
        this.ID = "SFAN" + sfanID;
        sfanID++;
        this.on = false;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public boolean isPortable (){
        return true;
    }
    
    public int getBreeziness(){
        return 2;
    }
    
    public int getNoisiness() {
        return 2;
    }
    
    public int coolsBy() {
        return 1;
    }
    
    public void turnOn() {
        this.on = true;
        //System.out.println("AC " + id + " turned on");
    }
    
    public void turnOff() {
        this.on = false;
        //System.out.println("AC " + id + " turned off");
    }
    
    public boolean isOn() {
        return on;
    }
    
    public boolean isBreezy() {
        return true;
    }
    
    public boolean isNoisy(){
        return true;
    }
}
