public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("ABC123");

        Screen screen1 = new Screen();
        Screen screen2 = new Screen();
        Screen screen3 = new Screen();

        System.out.println(car1.attachScreen(screen1));
        System.out.println(car1.attachScreen(screen2));
        System.out.println(car1.attachScreen(screen3));
        System.out.println(car1.toString());

        Suv suv1 = new Suv("XYZ789");
        System.out.println(suv1.attachScreen(screen1));

        System.out.println(suv1.toString());

        System.out.println(car1.attachScreen(screen1));
        System.out.println(car1.toString());
    }
}
