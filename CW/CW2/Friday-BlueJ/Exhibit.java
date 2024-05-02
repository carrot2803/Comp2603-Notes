import java.util.HashSet;

public class Exhibit {
    private HashSet<Artwork> masterpieces;

    public Exhibit() {
        this.masterpieces = new HashSet<Artwork>();
    }

    public HashSet<Artwork> getMasterpieces() {
        return this.masterpieces;
    }

    public boolean add(Artwork artWork) {
        if (artWork == null)
            return false;
        return this.masterpieces.add(artWork);
    }

    public String toString() {
        String s = "";
        for (Artwork artwork : masterpieces)
            s += artwork.toString() + "\n";
        return s;
    }
}
