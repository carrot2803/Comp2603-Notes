import java.util.Comparator;

public class AmountComparator implements Comparator<Object> {

    public int compare(Object obj1, Object obj2) {
        if (!(obj1 instanceof Bill) || !(obj2 instanceof Bill))
            throw new ClassCastException("Object must be of type Bill");
        Bill bill1 = (Bill) obj1;
        Bill bill2 = (Bill) obj2;
        return Double.compare(bill1.getAmount(), bill2.getAmount());
    }

}
