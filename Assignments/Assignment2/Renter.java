import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Renter {
    private String username;
    private String password;
    private Collection<Bill> bills;

    public Renter(String username, String password) {
        this.username = username;
        this.password = password;
        this.bills = new ArrayList<Bill>();
    }

    public String getUsername() {
        return this.username;
    }

    // idk abt this method but smalls ig
    public String getPassword() {
        return this.password;
    }

    public Collection<Bill> getBills() {
        return this.bills;
    }

    public void addBill(Bill bill) {
        boolean added = this.bills.add(bill);
        if (!added)
            System.out.println("Failed to add bill");
    }

    public void sortByPaid() {
        if (bills instanceof ArrayList)
            Collections.sort((ArrayList<Bill>) bills, new PaidComparator());
        else
            System.out.println("Failed to sort");
    }

    public void sortByAmount() {
        if (bills instanceof ArrayList)
            Collections.sort((ArrayList<Bill>) bills, new AmountComparator());
        else
            System.out.println("Failed to sort");
    }
}
