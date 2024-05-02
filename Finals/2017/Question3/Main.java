import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static void printEmployees(ArrayList<Employee> employees) {
        for (Employee emp : employees)
            System.out.println(emp.toString());
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 45000));

        Collections.sort(employees);

        System.out.println("Employees sorted by name:");
        printEmployees(employees);

        Collections.sort(employees, new SalaryComparator());

        System.out.println("\nEmployees sorted by salary:");
        printEmployees(employees);
    }
}
