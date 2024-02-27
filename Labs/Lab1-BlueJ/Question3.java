import java.util.Random;

public class Question3{
    public static void main(String[] args){
        Random random = new Random();
        int num1 = random.nextInt(1000);
        int num2 = random.nextInt(1000);
        System.out.println("What is the product of " + num1 +" and " + num2 + " ?");
        int product = num1 * num2;
        System.out.println("The answer is " + product);
    }
}