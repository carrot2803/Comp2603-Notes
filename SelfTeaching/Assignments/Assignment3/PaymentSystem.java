import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaymentSystem {
    private ArrayList<Renter> renters;
    private BillGenerator bills;

    public PaymentSystem() {
        this.renters = new ArrayList<>();
        this.bills = new BillGenerator();
        bills.generateBills();
    }

    private void generateAndAllocateBills(Renter renter) {
        List<Bill> generatedBills = bills.getBills();
        renter.getBills().addAll(generatedBills);
    }

    private Renter getRenter(String username, String password) {
        for (Renter renter : renters)
            if (renter.getUsername().equals(username) && renter.getPassword().equals(password))
                return renter;
        return null;
    }

    public String getRenterBills(String username, String password) {
        Renter renter = getRenter(username, password);
        if (renter == null)
            return "Renter not found.";
        return renter.getBills().toString();
    }

    public String getSortedRenterBillsByAmount(String username, String password) {
        Renter renter = getRenter(username, password);
        if (renter == null)
            return "Renter not found.";
        renter.sortByAmount();
        return renter.getBills().toString();
    }

    public String getSortedRenterBillsByPaid(String username, String password) {
        Renter renter = getRenter(username, password);
        if (renter == null)
            return "Renter not found.";
        renter.sortByPaid();
        return renter.getBills().toString();
    }

    public void payBill(Renter renter, Bill bill) {
        if (renter == null)
            return;
        for (Bill renterBill : renter.getBills())
            if (renterBill.getBillNumber().equals(bill.getBillNumber()))
                renterBill.setPaid(true);
    }

    public void addRenter(String username, String password) {
        Renter newRenter = new Renter(username, password);
        generateAndAllocateBills(newRenter);
        renters.add(newRenter);
    }

    public boolean validateRenter(String username, String password) {
        for (Renter renter : renters)
            if (renter.getUsername().equals(username) && renter.getPassword().equals(password))
                return true;
        System.out.println("Username : " + username + " Pass " + password);
        return false;
    }

    public boolean registerRenter(String username, String password) {
        if (validateRenter(username, password))
            return false;
        Renter renter = new Renter(username, password);
        int numBills = new Random().nextInt(10) + 1;
        for (int j = 0; j < numBills; j++) {
            Bill bill = generateBill();
            renter.addBill(bill);
        }

        return renters.add(renter);
    }

    private Bill generateBill() {
        String[] types = { "Electric", "Internet", "Water" };
        int typeIndex = new Random().nextInt(3);
        double amount = Math.floor((new Random().nextDouble() * 1000) * 100) / 100;
        int paidIndex = new Random().nextInt(2);
        boolean paid = (paidIndex == 1);
        Bill bill = new Bill(types[typeIndex], amount, paid);
        return bill;
    }
}
