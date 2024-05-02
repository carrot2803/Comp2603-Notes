public class Expresso extends CoffeeDrink {

    public Expresso() {
        add(new Water());
        add(new GroundCoffee());
    }

    public String toString() {
        String totalPrice = String.format("$%.2f", super.calculatePrice());
        return "Expresso " + super.toString() + "\nPRICE: " + totalPrice + "\n";
    }
}