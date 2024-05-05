import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamProgram {
    private static void printEmployees(List<Employee> employees, String title) {
        System.out.println(title);
        for (Employee emp : employees)
            System.out.println(emp.toString());
    }

    public static void main(String[] args) {
        String[] names = { "Adam", "Betty", "Charles", "David" };
        double[] salaries = { 2000.40, 578.00, 600.00, 489.00 };
        String[] departments = { "DCIT", "DCIT", "MATHS", "MATHS" };
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < names.length; i++)
            employees.add(new Employee(names[i], salaries[i], departments[i]));
        Collections.sort(employees, new SalaryComparator());
        printEmployees(employees, "Employees sorted by salary");
        Collections.sort(employees);
        printEmployees(employees, "Employees sorted by name");

        Collections.sort(employees, new DepartmentComparator());
        printEmployees(employees, "Employees sorted by department");

    }
}