package CourseWork.CW2.Friday10to12;

import java.util.TreeMap;
import java.util.Vector;

public class FieldLog {
    private TreeMap<Butterfly, Vector<Conservatory>> sightings;

    public FieldLog() {
        this.sightings = new TreeMap<Butterfly, Vector<Conservatory>>();
    }

    public void add(Butterfly butterfly, Conservatory conservatory) {
        if (!sightings.containsKey(butterfly)) {
            Vector<Conservatory> v = new Vector<Conservatory>();
            v.add(conservatory);
            sightings.put(butterfly, v);
        } else {
            Vector<Conservatory> v = sightings.get(butterfly);
            v.add(conservatory);
        }
    }

}
