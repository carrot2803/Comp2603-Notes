public class Employee implements Comparable<Object> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Employee))
            throw new IllegalArgumentException("Object must be of type Employee");
        Employee emp = (Employee) obj;
        return this.name.compareTo(emp.name);
    }
}
