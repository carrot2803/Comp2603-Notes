
public abstract class Shape implements I1, I2 {
    private String colour;
    private boolean visible;

    public Shape(String colour) {
        this.colour = colour;
        this.visible = true;
    }

    public String getColour() {
        return this.colour;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public abstract int getPerimeter();

    public abstract double getArea();

}
