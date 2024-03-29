// 816035591 Dmitri Lezama
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Renter {
    private String username;
    private String password;
    private Collection<Bill> bills;

    // Constructors
    public Renter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Renter(String username, String password, Collection<Bill> bills) {
        this(username, password);
        this.bills = bills;
    }

    // accessors
    public String getUsername() {
        return this.username;
    }

    // this probably not good to do
    public String getPassword() {
        return this.password;
    }

    public String[] getBills() {
        if (bills == null || bills.size() == 0)
            return null;
        String[] bills = new String[this.bills.size()];
        int i = 0;
        for (Bill bill : this.bills)
            bills[i++] = bill.toString() + "\n";
        return bills;
    }

    public String[] getSortedBillsByAmount() {
        if (bills instanceof ArrayList)
            Collections.sort((ArrayList<Bill>) bills, new AmountComparator());
        else
            System.out.println("Failed to sort");
        return getBills();
    }

    public String[] getSortedBillsByPaid() {
        if (bills instanceof ArrayList)
            Collections.sort((ArrayList<Bill>) bills, new PaidComparator());
        else
            System.out.println("Failed to sort");
        return getBills();
    }

    // methods
    public int hashCode() {
        return this.username.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Renter))
            return false;
        Renter renter = (Renter) obj;
        return this.username.equals(renter.getUsername()) &&
                this.password.equals(renter.getPassword());
    }

}
