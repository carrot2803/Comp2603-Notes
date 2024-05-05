import java.util.Comparator;

public class DepartmentComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        if (!(obj1 instanceof Employee) || !(obj2 instanceof Employee))
            throw new IllegalArgumentException("Object must be of type Employee");
        Employee emp1 = (Employee) obj1;
        Employee emp2 = (Employee) obj2;
        return emp1.getDepartment().compareTo(emp2.getDepartment());
    }
}
