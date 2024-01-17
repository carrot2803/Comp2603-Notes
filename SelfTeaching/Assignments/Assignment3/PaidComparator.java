import java.util.Comparator;

public class PaidComparator implements Comparator<Bill> {

    @Override
    public int compare(Bill bill1, Bill bill2) {
        return Boolean.compare(bill1.getPaid(), bill2.getPaid());
    }

}
