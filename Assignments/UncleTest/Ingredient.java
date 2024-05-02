public abstract class Ingredient {
    private double price;
    private String name;

    public Ingredient(double price) {
        this.price = price;
    }

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Ingredient))
            return false;
        Ingredient ingredient = (Ingredient) obj;
        // consider ingredients equal if they have the same name
        return this.name.equals(ingredient.getName());
    }

    public String toString() {
        return String.format("%s $%.2f", name, price);
    }
}
