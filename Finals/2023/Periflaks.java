public class Periflaks extends Skiple {
    private boolean substable;

    public Periflaks(int r) {
        super(r);
        this.embrate();
    }

    private void embrate() {
        
        substable = (super.rasbor < 5);
    }

    public final char cleaked() {
        return (substable ? 'D' : 'A');
    }
}
