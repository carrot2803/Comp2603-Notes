import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Nursery {
    private Collection<Plant> plants;

    public Nursery() {
        plants = new ArrayList<Plant>();
    }

    public String addPlant(String name, String price, String quantity) {
        double plantPrice = Double.parseDouble(price);
        int plantQuantity = Integer.parseInt(quantity);
        Plant plant = new Plant(name, plantPrice, plantQuantity);
        if (!plants.add(plant))
            return "Plant " + name + " not added";
        return "Plant successfully added: \n" + plant.getPlantDetails();
    }

    public ArrayList<String> getPlant(String plantName) {
        Plant p = getPlantObject(plantName);
        if (p != null)
            return p.getPlantDetails();
        ArrayList<String> res = new ArrayList<>();
        res.add("Plant not found in greenhouse");
        return res;
    }

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

    public String updatePlant(String name, String price, String quantity) {
        Plant p = getPlantObject(name);
        if (p == null)
            return "Plant " + name + " not found";
        p.setPrice(Double.parseDouble(price));
        p.setQuantity(Integer.parseInt(quantity));
        return name + " Updated Successfully";
    }

    public String deletePlant(String name, String price, String quantity) {
        Plant p = getPlantObject(name);
        if (p == null)
            return "Plant " + name + " not found";
        return "Plant deleted " + (plants.remove(p) ? "successfully" : "unsucessfully");
    }

    public String getPlantsAsString(ArrayList<Plant> plants) {
        String s = "";
        for (Plant plant : plants)
            s += plant.toString() + "\n";
        return s;
    }

    public String getPlantsByName() {
        if (plants.isEmpty())
            return "No plants in greenhouse at the moment";
        ArrayList<Plant> sortedByName = new ArrayList<Plant>(plants);
        Collections.sort(sortedByName);
        return getPlantsAsString(sortedByName);
    }

    // public String getPlantsByPrice() {
    // if (plants.isEmpty())
    // return "No plants in greenhouse at the moment";
    // TreeSet<Plant> sortedByPrice = new TreeSet<>(new PriceComparator());
    // sortedByPrice.addAll(plants);
    // return getPlantsAsString(new ArrayList<Plant>(sortedByPrice));
    // }

    public String getPlantsByPrice() {
        if (plants.isEmpty())
            return "No plants in greenhouse at the moment";
        ArrayList<Plant> sortedByPrice = new ArrayList<Plant>(plants);
        Collections.sort(sortedByPrice, new PriceComparator());
        return getPlantsAsString(sortedByPrice);
    }

    private class PriceComparator implements Comparator<Object> {
        public int compare(Object obj1, Object obj2) {
            if (!(obj1 instanceof Plant) || !(obj2 instanceof Plant))
                throw new IllegalArgumentException("Object must be of type Plant");
            Plant p1 = (Plant) obj1;
            Plant p2 = (Plant) obj2;
            if (p1.getPrice() > p2.getPrice())
                return 1;
            else if (p1.getPrice() < p2.getPrice())
                return -1;
            return 0;
        }
    }
}
