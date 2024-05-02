package CourseWork.CW2.Thursday;

import java.util.ArrayList;
import java.util.HashMap;

public class Delivery {
    private HashMap<Juice, ArrayList<Store>> juiceStores;

    public Delivery() {
        this.juiceStores = new HashMap<Juice, ArrayList<Store>>();
    }
}
