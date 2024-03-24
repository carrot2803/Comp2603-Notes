import java.util.Comparator;

public class PaidComparator implements Comparator<Bill> {
    public int compare(Bill bill1, Bill bill2) {
        return Boolean.compare(bill2.isPaid(), bill1.isPaid());
    }
}
