package CourseWork.CW2.Fridayat8to10;

import java.util.TreeMap;
import java.util.Vector;

public class ArtDirectory {
    private TreeMap<ArtWork, Vector<Museum>> catalogue;

    public ArtDirectory() {
        this.catalogue = new TreeMap<ArtWork, Vector<Museum>>();
    }

}
