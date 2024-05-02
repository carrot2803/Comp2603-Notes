public class Vent {
    private static int counter = 1;
    private String ventID;
    private Roof roof;

    public Vent(Roof roof) {
        this.ventID = "V" + counter++;
        this.roof = roof;
    }

    public String getVentID() {
        return this.ventID;
    }

    public Roof getRoof() {
        return this.roof;
    }
}
