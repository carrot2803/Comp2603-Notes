package CourseWork.CW2.Friday10to12;

public class Butterfly implements Comparable<Object> {
    private String species;

    public Butterfly(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return species;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Butterfly))
            return false;
        Butterfly b = (Butterfly) obj;
        return this.species.equals(b.getSpecies());
    }

    public int hashCode() {
        return species.hashCode();
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Butterfly))
            throw new IllegalArgumentException();
        Butterfly b = (Butterfly) obj;
        return b.getSpecies().compareTo(this.species);
    }

}
