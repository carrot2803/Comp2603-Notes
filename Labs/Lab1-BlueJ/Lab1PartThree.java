import java.util.Scanner;

public class Lab1PartThree {
    private static Scanner scanner = new Scanner(System.in);
    public static void exercise1( ){
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.printf("A circle with radius %.2f has an area of %.2f units \n", radius, area);
    }

    public static void exercise2( ){
        int n = scanner.nextInt();
        System.out.print(" Even numbers from "+ n + " : ");
        for(int i = 2; i <= n; i+=2){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        exercise1(); // invokes the exercise1( ) method
        exercise2(); // invokes the exercise2( ) method
        scanner.close();
    }
}