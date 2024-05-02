import java.util.ArrayList;
import java.util.Collection;

public class PaymentSystem {
    private Collection<Renter> renters;
    private BillGenerator bills;

    // constructors
    public PaymentSystem() {
        this.renters = new ArrayList<Renter>();
        this.bills = new BillGenerator();
    }

    // accessors
    private Renter getRenter(Renter r) {
        if (!renters.contains(r))
            return null;
        for (Renter renter : renters)
            if (renter.equals(r))
                return renter;
        return null;
    }

    public String[] getRenterBills(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return null;
        return renter.getBills();
    }

    public String[] getSortedRenterBillsByAmount(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return null;
        return renter.getSortedBillsByAmount();
    }

    public String[] getSortedRenterBillsByPaid(String username, String password) {
        Renter renter = getRenter(new Renter(username, password));
        if (renter == null)
            return null;
        return renter.getSortedBillsByPaid();
    }

    // mutators
    public boolean registerRenter(String username, String password) {
        if (validateRenter(username, password))
            return false;
        return renters.add(new Renter(username, password, bills.getAllocatedBills()));
    }

    public boolean validateRenter(String username, String password) {
        return getRenter(new Renter(username, password)) != null;
    }
}
