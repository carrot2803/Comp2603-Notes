package CourseWork.CW2.Fridayat8to10;

import java.util.HashSet;

public class Exhibit {
    private HashSet<ArtWork> masterpieces;

    public Exhibit() {
        this.masterpieces = new HashSet<ArtWork>();
    }

    public HashSet<ArtWork> getMasterpieces() {
        return this.masterpieces;
    }

    public boolean add(ArtWork artWork) {
        if (artWork == null)
            return false;
        return this.masterpieces.add(artWork);
    }

    public String toString() {
        String s = "";
        for (ArtWork artwork : masterpieces)
            s += artwork.toString() + "\n";
        return s;
    }
}
