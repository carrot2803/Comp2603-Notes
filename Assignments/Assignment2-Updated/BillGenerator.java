import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class BillGenerator {
    private ArrayList<Bill> bills;
    private Random rand = new Random();

    public BillGenerator() {
        this.bills = new ArrayList<Bill>();
        this.rand = new Random();
        generateBills();
    }

    // accessors
    public ArrayList<Bill> getAllocatedBills() {
        ArrayList<Bill> allocatedBills = new ArrayList<Bill>();
        int n = rand.nextInt(10) + 1;
        for (int i = 0; i < n; i++) {
            if (bills.size() == 0) {
                System.out.println("All bills have been allocated");
                break;
            }
            int index = rand.nextInt(bills.size());
            allocatedBills.add(bills.get(index));
            bills.remove(index);
        }
        Collections.sort(allocatedBills);
        return allocatedBills;
    }

    public ArrayList<Bill> getBills() {
        return this.bills;
    }

    // methods
    private void generateBills() {
        String[] types = { "Electric", "Internet", "Water   " }; // added padding
        int typeIndex = rand.nextInt(3);
        double amount = Math.floor((rand.nextDouble() * 1000) * 100) / 100;
        int paidIndex = rand.nextInt(2);
        boolean paid = false;
        for (int i = 0; i < 40; i++) {
            bills.add(new Bill(types[typeIndex], amount, paid));
            paidIndex = rand.nextInt(2);
            if (paidIndex == 0)
                paid = false;
            else
                paid = true;
            typeIndex = rand.nextInt(3);
            amount = Math.floor((rand.nextDouble() * 1000) * 100) / 100;
        }
        Iterator<Bill> iter = bills.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

    public String toString() {
        String s = "";
        for (Bill bill : this.bills)
            s += bill.toString() + "\n";
        return s;
    }

}
