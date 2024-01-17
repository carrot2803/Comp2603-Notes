import java.util.ArrayList;
import java.util.Random;

public class BillGenerator {
    private ArrayList<Bill> bills;
    private Random random;

    public BillGenerator() {
        this.bills = new ArrayList<Bill>();
        this.random = new Random();
    }

    public void generateBills() {
        String[] types = { "Electric", "Internet", "Water" };
        int typeIndex = random.nextInt(3);
        double amount = Math.floor((random.nextDouble() * 1000) * 100) / 100;
        int paidIndex = random.nextInt(2);
        boolean paid = false;

        for (int i = 0; i < 40; i++) {
            bills.add(new Bill(types[typeIndex], amount, paid));
            paidIndex = random.nextInt(2);
            paid = (paidIndex == 0);
            typeIndex = random.nextInt(3);
            amount = Math.floor((random.nextDouble() * 1000) * 100) / 100;
        }

        for (Bill bill : bills)
            System.out.println(bill);
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }
}
