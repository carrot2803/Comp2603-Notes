public abstract class Fan implements Device {
    private static int fanID = 1;
    private String ID;
    private int noisiness;
    private boolean isOn;

    public Fan(int noisiness) {
        this.ID = "F" + fanID++;
        this.noisiness = noisiness;
        this.isOn = false;
    }

    public String getID() {
        return this.ID;
    }

    public int getBreeziness() {
        return 2;
    }

    public int getNoisiness() {
        return noisiness;
    }

    public boolean isBreezy() {
        return getBreeziness() > 0;
    }

    public boolean isNoisy() {
        return getNoisiness() > 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

}
