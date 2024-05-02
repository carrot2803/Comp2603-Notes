import java.util.Comparator;

public class SalaryComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        if (!(obj1 instanceof Employee) || !(obj2 instanceof Employee))
            throw new IllegalArgumentException("Object must be of type Employee");
        Employee emp1 = (Employee) obj1;
        Employee emp2 = (Employee) obj2;
        if (emp1.getSalary() > emp2.getSalary())
            return 1;
        else if (emp1.getSalary() < emp2.getSalary())
            return -1;
        return 0;
    }

}
