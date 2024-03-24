
import java.util.*;

public class Nursery {
    private Collection<Plant> plants;
    // Create a new Collection of Plant objects, called plants

    // Constructor
    public Nursery() {
        plants = new ArrayList<Plant>();
    }

    /*
     * This method creates a new plant object and inserts it into the collection
     * of plants. The String parameters are converted to primitive types as
     * necessary before creating a new Plant object.
     */
    public String addPlant(String name, String price, String quantity) {
        if (price.equals("") || quantity.equals(""))
            return "Plant not added, missing data";

        double plantPrice = Double.parseDouble(price);
        int plantQuantity = Integer.parseInt(quantity);
        if ((plantPrice < 0) || (plantQuantity < 0))
            return "Plant " + name + " not added";

        Plant p = new Plant(name, plantPrice, plantQuantity);
        if (plants.add(p))
            return "Plant successfully added: \n" + p.toString();
        return "Plant could not be added\n";
    }

    /*
     * This method retrieves a plant object from the collection using a plant
     * name as the search criteria. If found, the details of the plant are
     * returned as an ArrayList of Strings by invoking the getPlantDetails()
     * method from the Plant class.
     */
    public ArrayList<String> getPlant(String plantName) {
        return null;
    }

    /*
     * This is a private helper method. It searches the collection of plants
     * for the plant with the given name. If found, the Plant object is returned
     * otherwise null is returned
     */
    private Plant getPlantObject(String plantName) {
        Plant p = new Plant(plantName);
        if (plants.contains(p)) {
            for (Plant pt : plants) {
                if (pt.equals(p))
                    return pt;
            }
        }
        return null;
    }

    /*
     * This method retrieves a plant object from the collection using a plant
     * name as the search criteria. If found, the details of the plant object
     * are updated with the input data.
     */
    public String updatePlant(String name, String price, String quantity) {
        return "Could not update plant details. Plant " + name + " not found";
    }

    /*
     * This method returns a sorted list of the details of all of the plants in
     * the collection. The list is sorted alphabetically by plant name. If the
     * collection is empty, the default message is sent.
     */
    public String getPlantsByName() {
        if (!plants.isEmpty())
            return plants.toString();
        return "No plants in greenhouse at the moment";
    }

    /*
     * This method returns a sorted list of the details of all of the plants in
     * the collection. The list is sorted in ascending order by price. If the
     * collection is empty, the default message is sent.
     */
    public String getPlantsByPrice() {
        String msg = "No plants in greenhouse at the moment";
        return msg;
    }

}
