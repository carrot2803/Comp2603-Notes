public class Block extends Shape {
    private Rectangle rectangle;
    private Square square;

    public Block(String colour, int x) {
        super(colour);
        this.rectangle = new Rectangle(colour, x * 2, x);
        this.square = new Square(colour, x);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Block))
            throw new ClassCastException("Felicia is an egg");
        Block block = (Block) obj;
        return this.rectangle.equals(block.rectangle) && this.square.equals(block.square);
    }

    public int getPerimeter() {
        return rectangle.getPerimeter() + square.getPerimeter();
    }

    public double getArea() {
        return rectangle.getArea() + square.getArea();
    }

}
