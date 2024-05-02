package CourseWork.CW2.Thursday;

public class Juice implements Comparable<Object> {
    private String brand;

    public Juice(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Juice))
            throw new ClassCastException("Object must be of type Juice");
        Juice juice = (Juice) obj;
        return this.brand.compareTo(juice.getBrand());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Juice))
            return false;
        Juice juice = (Juice) obj;
        return this.brand.equals(juice.getBrand());
    }

    public String toString() {
        return this.brand;
    }
}