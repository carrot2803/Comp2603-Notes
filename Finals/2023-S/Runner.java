public class Runner {
    public static void main(String[] args) {
        // Rectangle r = new Shape("Blue");
        // Shape s = new Block("Blue", 9);

        Rectangle r = new Rectangle("Blue", 90, 180);
        Shape s1 = new Rectangle("Blue", 90, 180);
        Shape s2 = new Block("Blue", 90);

        System.out.println(s2.equals(s1));
    }
}
