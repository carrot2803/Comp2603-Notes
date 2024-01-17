public abstract class Fan implements Device {
    private static int fanId = 0;
    private int id;
    private int noisiness;
    private boolean on;

    public Fan(int noisiness) {
        fanId++;
        this.id = fanId;
        this.noisiness = noisiness;
        this.on = false;
    }

    public String getId() {
        return "F" + id;
    }
    
    public int getBreeziness(){
        return 2;
    }
    
    public int getNoisiness() {
        return noisiness;
    }
}
