import java.util.ArrayList;
import java.util.Random;

public class BillGenerator {
    private ArrayList<Bill> bills;
    private Random rand;

    public BillGenerator() {
        bills = new ArrayList<Bill>();
        rand = new Random();
        generateBills();
    }

    private void generateBills() {
        String[] types = { "Electric", "Internet", "Water" };
        int typeIndex = rand.nextInt(3);
        double amount = Math.floor((rand.nextDouble() * 1000) * 100) / 100;
        int paidIndex = rand.nextInt(2);
        boolean paid = false;
        for (int i = 0; i < 40; i++) {
            bills.add(new Bill(types[typeIndex], amount, paid));
            paidIndex = rand.nextInt(2);
            paid = (paidIndex != 0);
            typeIndex = rand.nextInt(3);
            amount = Math.floor((rand.nextDouble() * 1000) * 100) / 100;
        }
    }

    public ArrayList<Bill> getBills() {
        int n = rand.nextInt(1, 10);
        ArrayList<Bill> allocatedBills = new ArrayList<Bill>();
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(bills.size());
            allocatedBills.add(bills.get(index));
            bills.remove(index);
        }
        return allocatedBills;
    }

}
