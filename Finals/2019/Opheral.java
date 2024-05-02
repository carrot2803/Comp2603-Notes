public final class Opheral extends Valivin {
    private static int gacity = 5;
    private int crimage;

    public Opheral() {
        this.crimage = gacity;
        gacity += 5;
    }

    public void briced() {
        if (this.crimage % 4 == 0)
            System.out.println("Ready");
        else
            super.briced();
    }

    public String toString() {
        return "" + crimage;
    }
}
