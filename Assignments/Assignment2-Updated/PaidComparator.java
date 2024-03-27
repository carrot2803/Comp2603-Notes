import java.util.Comparator;

public class PaidComparator implements Comparator<Object> {

    public int compare(Object obj1, Object obj2) {
        if (!(obj1 instanceof Bill) || !(obj2 instanceof Bill))
            throw new ClassCastException("Object must be of type Bill");

        String paidStatus1 = ((Bill) obj1).checkPaid();
        String paidStatus2 = ((Bill) obj2).checkPaid();

        if (paidStatus1.equals("PAID") && paidStatus2.equals("UNPAID"))
            return 1;
        else if (paidStatus1.equals("UNPAID") && paidStatus2.equals("PAID"))
            return -1;
        return 0;
    }
}
