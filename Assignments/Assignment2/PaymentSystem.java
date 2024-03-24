import java.util.ArrayList;
import java.util.Collection;

public class PaymentSystem {
    private Collection<Renter> renters;
    private BillGenerator bills;

    public PaymentSystem() {
        this.renters = new ArrayList<Renter>();
        this.bills = new BillGenerator();
    }

    private Renter getRenter(Renter r) {
        for (Renter renter : renters)
            if (renter.getUsername().equalsIgnoreCase(r.getUsername()) &&
                    renter.getPassword().equalsIgnoreCase(r.getPassword()))
                return renter;
        return null;
    }

    private String getBillsAsString(Collection<Bill> bills) {
        String s = "";
        for (Bill bill : bills)
            s += bill.toString() + "\n";
        return s;
    }

    public String getRenterBills(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return "Invalid username or password";
        return getBillsAsString(renter.getBills());
    }

    public String getRenterBillsByAmount(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return "Invalid username or password";
        renter.sortByAmount();
        return getBillsAsString(renter.getBills());
    }

    public String getRenterBillsByPaid(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return "Invalid username or password";
        renter.sortByPaid();
        return getBillsAsString(renter.getBills());
    }

    private void allocateBills(Renter renter) {
        ArrayList<Bill> arr = bills.getBills();
        for (Bill bill : arr)
            renter.addBill(bill);
    }

    public boolean registerRenter(String username, String password) {
        for (Renter renter : renters)
            if (renter.getUsername().equalsIgnoreCase(username))
                return false;
        Renter newRenter = new Renter(username, password);
        allocateBills(newRenter);
        return renters.add(newRenter);
    }

    public boolean validateRenter(String username, String password) {
        for (Renter renter : renters)
            if (renter.getUsername().equalsIgnoreCase(username) &&
                    renter.getPassword().equalsIgnoreCase(password))
                return true;
        return false;
    }
}
