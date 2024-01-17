import java.util.Comparator;

public class AmountComparator implements Comparator<Bill> {

    @Override
    public int compare(Bill bill1, Bill bill2) {
        return Double.compare(bill1.getAmount(), bill2.getAmount());
    }

}
