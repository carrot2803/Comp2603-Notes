import java.util.ArrayList;

public abstract class CoffeeDrink implements Drink {
    private ArrayList<Ingredient> ingredients;

    public CoffeeDrink() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public ArrayList<Ingredient> getIngredientList() {
        return this.ingredients;
    }

    public double calculatePrice() {
        double sum = 0.00;
        for (Ingredient ingredient : this.ingredients)
            sum += ingredient.getPrice();
        return sum;
    }

    public void add(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public String toString() {
        return "" + this.getIngredientList();
    }
}