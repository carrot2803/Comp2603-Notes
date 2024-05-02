public class Artwork implements Comparable<Object>{
    private String artID;

    public Artwork(String artID){
        this.artID = artID;
    }

    public String getArtID(){
        return this.artID;
    }

    public int compareTo(Object obj){
        if(!(obj instanceof Artwork))
            throw new ClassCastException("Object must be instance of ArtWork");
        Artwork artwork = (Artwork)  obj;
        return artwork.artID.compareTo(this.artID);
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Artwork))
            throw new ClassCastException("Object must be instance of ArtWork");
        Artwork artwork = (Artwork)  obj;
        return artwork.getArtID().equals(this.getArtID());
    }

    public String toString(){
        return this.artID;
    }

}