import java.util.TreeMap;
import java.util.Vector;

public class ArtDirectory{
    private TreeMap<Artwork, Vector<Museum>> catalogue;

    public ArtDirectory(){
        this.catalogue = new TreeMap<Artwork, Vector<Museum>>();
    }
}