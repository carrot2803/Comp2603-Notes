package CourseWork.CW2.Friday10to12;

import java.util.HashSet;

public class Solarium {
    private HashSet<Butterfly> butterflies;

    public Solarium() {
        this.butterflies = new HashSet<Butterfly>();
    }

    public boolean add(Butterfly butterfly) {
        if (butterfly == null)
            return false;
        return this.butterflies.add(butterfly);
    }

    public String toString() {
        String s = "";
        for (Butterfly butterfly : butterflies)
            s += butterfly.toString() + "\n";
        return s;
    }
}
