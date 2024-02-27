import java.util.Random;

public class Question3 {

    public static void main(String[] args) {
        final int range = 100;
        Random random = new Random();
        int num1 = random.nextInt(range);
        int num2 = random.nextInt(range);
        System.out.println("What is the product of " +
                num1 + " and " + num2 + " ?");
        System.out.println("The answer is " + (num1 * num2));
    }
}
