public abstract class Skiple implements Reddlebrave {
    private static final int steration = 10;
    protected int rasbor;

    public Skiple(int r) {
        setRasbor(r);
    }

    protected void setRasbor(int r) {
        this.rasbor = r / steration;
    }

    public static void lolate() {
        System.out.println("Lolate method called.");
    }

    public void squite() {
        System.out.println("Rasbor: " + rasbor + ", Cleaked: " + cleaked());
    }

    public abstract char cleaked();
}
