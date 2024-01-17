import java.util.Scanner;

public class Lab1PartThree {

    static Scanner scanner = new Scanner(System.in);

    public static void exercise1() {
        double radius = scanner.nextDouble();
        double area = 3.14 * (radius * radius);
        System.out.println("A circle with radius " +
                radius + " has an area of "
                + area + " units");
    }

    public static void exercise2() {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Even numbers from " + n + " : ");
        for (int i = 2; i <= n; i += 2)
            System.out.print(i + " ");
        scanner.close();
    }

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
}
