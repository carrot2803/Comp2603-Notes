package CourseWork.CW2.Thursday;

import java.util.TreeSet;

public class VendingMachine {
    private TreeSet<Juice> juices;

    public VendingMachine() {
        this.juices = new TreeSet<Juice>();
    }

    public TreeSet<Juice> getJuices() {
        return this.juices;
    }

    public boolean addJuice(Juice juice) {
        if (juice == null)
            return true;
        return juices.add(juice);
    }

    public String toString() {
        String result = "";
        for (Juice juice : juices)
            result += juice.toString() + "\n";
        return result;
    }

}
