public class CeilingFan extends Fan {
    private int coolsBy = 3;

    public CeilingFan() {
        super(0);
    }

    public String getID() {
        return "C" + super.getID();
    }

    public int coolsBy() {
        return this.coolsBy;
    }

    public boolean isPortable() {
        return false;
    }

}
