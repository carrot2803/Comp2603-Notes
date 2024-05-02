public final class Cappuccino extends Expresso {

    public Cappuccino() {
        super();
        add(new SteamedMilk());
        add(new FoamyMilk());
        add(new FoamyMilk());
    }

}