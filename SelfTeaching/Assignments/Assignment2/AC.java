public class AC implements Device {
    private static int idCount = 1;
    private String ID;
    private boolean isOn;

    public AC() {
        this.ID = "AC" + idCount++;
        this.isOn = false;
    }

    public String getID() {
        return ID;
    }

    public boolean isBreezy() {
        return false;
    }

    public boolean isNoisy() {
        return false;
    }

    public boolean isPortable() {
        return false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
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
