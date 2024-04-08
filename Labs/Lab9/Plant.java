import java.util.ArrayList;

public class Plant implements Comparable<Object> {
    private String name;
    private double price;
    private int quantity;

    public Plant(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Overloaded constructor
    public Plant(String name) {
        this.name = name;
    }

    // Accessors
    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setQuantity(int updatedQuantity) {
        quantity = updatedQuantity;
    }

    // Mutator
    public double getPrice() {
        return price;
    }

    /*
     * Returns an ArrayList containing the tokenised details of the Plant.
     * The ArrayList is used for displaying plant data in the GreenHouseGUI.
     * This method serves to decouple the GreenhouseGUI from the Plant class
     */
    public ArrayList<String> getPlantDetails() {
        ArrayList<String> details = new ArrayList<>();
        details.add(name);
        details.add(price + "");
        details.add(quantity + "");
        return details;
    }

    public String toString() {
        return "Plant Name: " + name + " Price: $" + price + " Quantity: " + quantity + "\n";
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Plant))
            throw new ClassCastException("Object must be instance of Plant");
        Plant plant = (Plant) obj;
        return this.name.compareTo(plant.name);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Plant))
            return false;
        Plant plant = (Plant) obj;
        return this.name.equals(plant.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

}