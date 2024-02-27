import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hi what's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name);
        System.out.println(name.substring(0, 2));
        scanner.close();
    }
}
