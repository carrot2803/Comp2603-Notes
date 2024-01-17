public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String toString() {
        return "Plant Name: " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Plant))
            return false;
        Plant p = (Plant) obj;
        return this.name.equals(p.name);
    }
}