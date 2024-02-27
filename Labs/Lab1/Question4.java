import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question4 {
    private static int getPos() {
        Random r = new Random();
        int pos = r.nextInt(3);
        return pos;
    }

    private static void response(int index) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("howdy");
        arr.add("bye");
        System.out.println(arr.get(index));
    }

    private static void conversation() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!s.equalsIgnoreCase("exit")) {
            response(getPos());
            s = scanner.nextLine();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        conversation();
    }
}
