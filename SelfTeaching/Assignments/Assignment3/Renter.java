import java.util.ArrayList;
import java.util.Collections;

public class Renter {
    private String username;
    private String password;
    private ArrayList<Bill> bills;

    public Renter(String username, String password) {
        this.username = username;
        this.password = password;
        bills = new ArrayList<>();
    }

    // mutators
    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    public void sortByPaid() {
        Collections.sort(bills, new PaidComparator());
    }

    public void sortByAmount() {
        Collections.sort(bills, new AmountComparator());
    }

    // accessors
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public ArrayList<Bill> getBills() {
        return this.bills;
    }

}
