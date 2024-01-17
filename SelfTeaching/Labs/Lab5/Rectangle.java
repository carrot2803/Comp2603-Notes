import java.awt.geom.Rectangle2D;
// import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape {

    private int length;
    private int breadth;
    // private int edgeRoundness;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
        // edgeRoundness = 0;
        xLoc += length + 10;
        calculateArea();
    }

    // mutators
    @Override
    public void calculateArea() {
        area = length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }

    @Override
    public Shape draw() {
        double x = xLoc;
        double y = yLoc;
        return new Rectangle2D.Double(x, y, length, breadth);
    }
}
