import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape {

    protected int radius;

    public Circle(int r) {
        radius = r;
        xLoc += radius + 10;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle " + super.toString();
    }

    @Override
    public Shape draw() {
        double x = xLoc - radius;
        double y = yLoc - radius;
        double diameter = 2 * radius;

        return new Ellipse2D.Double(x, y, diameter, diameter);
    }

}
