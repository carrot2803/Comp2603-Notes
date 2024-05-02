import java.util.Comparator;

public class PaidComparator implements Comparator<Object> {

    public int compare(Object obj1, Object obj2) {
        if (!(obj1 instanceof Bill) || !(obj2 instanceof Bill))
            throw new ClassCastException("Object must be of type Bill");

        String paidStatus1 = ((Bill) obj1).checkPaid();
        String paidStatus2 = ((Bill) obj2).checkPaid();

        return comparePaidStatus(paidStatus1, paidStatus2);
    }

    private int comparePaidStatus(String status1, String status2) {
        return status1.equalsIgnoreCase("UNPAID") && status2.equalsIgnoreCase("PAID") ? 1
                : status1.equalsIgnoreCase("PAID") && status2.equalsIgnoreCase("UNPAID") ? -1 : 0;
    }
}
