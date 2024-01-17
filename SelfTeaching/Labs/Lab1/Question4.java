import java.util.Random;
import java.util.Scanner;

public class Question4 {
    private static void response(int index) {
        String[] arr = { "hi", "hello", "bye" };
        System.out.println(arr[index]);
    }

    private static int getPos() {
        Random r = new Random();
        int pos = r.nextInt(3);
        return pos;
    }

    public static void conversation() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!s.equals("exit")) {
            response(getPos());
            s = scanner.nextLine();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        conversation();
    }
}
