import java.util.Scanner;

public class Lab1PartTwo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name);
        scanner.close();
    }
}