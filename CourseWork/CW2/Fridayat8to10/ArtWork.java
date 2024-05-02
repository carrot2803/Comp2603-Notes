package CourseWork.CW2.Fridayat8to10;

public class ArtWork implements Comparable<Object> {
    private String artID;

    public ArtWork(String artID) {
        this.artID = artID;
    }

    public String getArtID() {
        return artID;
    }

    public String toString() {
        return artID;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ArtWork))
            return false;
        ArtWork artWork = (ArtWork) obj;
        return this.artID.equals(artWork.getArtID());
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof ArtWork))
            throw new ClassCastException("Object must be of type ArtWork");
        ArtWork artWork = (ArtWork) obj;
        return artWork.getArtID().compareTo(this.getArtID());
    }

    public int hashCode() {
        return artID.hashCode();
    }
}
