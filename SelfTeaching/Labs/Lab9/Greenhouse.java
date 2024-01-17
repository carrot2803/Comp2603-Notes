import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Greenhouse {

    private static void printVegetables(Collection<Plant> vegetables) {
        for (Plant plant : vegetables)
            System.out.println(plant.toString());
    }

    private static void checkVegetables(Collection<Plant> vegetables) {
        if (vegetables.isEmpty())
            System.out.println("No plants were found in the vegetables collection");
        // printVegetables(vegetables);
        System.out.println("present");
    }

    public static void main(String[] args) {
        Collection<Plant> vegetables = new LinkedList<>();

        Plant p1 = new Plant("Large Tomato");
        vegetables.add(p1);
        vegetables.add(p1);
        vegetables.add(new Plant("Small Tomato"));
        vegetables.add(new Plant("Potato"));
        vegetables.add(new Plant("Small Potato"));

        checkVegetables(vegetables);

        List<Plant> vegetablesList = (List<Plant>) vegetables;

        vegetablesList.add(new Plant("Carrot"));
        System.out.println("After adding Carrot:");
        // printVegetables(vegetables);

        Plant retrievedPlant = vegetablesList.get(2);
        System.out.println("Retrieved plant at index 2: " + retrievedPlant);

        vegetablesList.remove(new Plant("Small Potato"));
        System.out.println("After removing Small Potato:");
        // printVegetables(vegetables);

        Plant p7 = new Plant("Lettuce");

        Plant elementAtPosition2 = vegetablesList.get(2);
        vegetablesList.add(2, p7);
        vegetablesList.add(elementAtPosition2);

        // System.out.println("After inserting Lettuce at position 2 and adding the
        // element from position 2 to the end:");
        // printVegetables(vegetables);

        vegetablesList.add(new Plant("Broccoli"));
        vegetablesList.add(new Plant("Spinach"));
        vegetablesList.add(new Plant("Cucumber"));

        Plant firstPlant = vegetablesList.remove(0);
        vegetablesList.add(vegetablesList.size() / 2, firstPlant);
        System.out.println("After removing the first element and inserting it in the middle:");
        printVegetables(vegetables);

        System.out.println("Half List");
        List<Plant> halfVegetablesList = vegetablesList.subList(0, vegetablesList.size() / 2);
        printVegetables(halfVegetablesList);
    }
}
