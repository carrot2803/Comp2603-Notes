public class Employee implements Comparable<Object> {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Employee))
            throw new IllegalArgumentException("Object must be of type Employee");
        Employee emp = (Employee) obj;
        return this.name.compareTo(emp.name);
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }

}
