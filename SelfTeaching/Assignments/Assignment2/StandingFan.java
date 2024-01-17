public class StandingFan extends Fan implements PortableDevice {
    private int coolsBy = 1;

    public StandingFan() {
        super(2);
    }

    public String getID() {
        return "S" + super.getID();
    }

    public int coolsBy() {
        return this.coolsBy;
    }

    public boolean isPortable() {
        return true;
    }

}
