import java.util.Scanner;

public class Lab1PartThree {
    private static Scanner scanner = new Scanner(System.in);

    public static void exercise1() {
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("A circle with radius " + radius
                + " has an area of " +
                String.format("%.02f", area) + " units");
    }

    public static void exercise2() {
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        System.out.print("Even numbers from " + n + " : ");
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        exercise1();
        exercise2();
        scanner.close();
    }
}
