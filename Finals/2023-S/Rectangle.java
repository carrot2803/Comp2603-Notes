
public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(String colour, int length, int breadth) {
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    public double getArea() {
        return length * breadth;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle))
            throw new ClassCastException();
        Rectangle rectangle = (Rectangle) obj;
        return this.length == rectangle.length && this.breadth == rectangle.breadth;
    }
}
