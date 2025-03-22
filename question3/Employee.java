import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Sandhya Bhosale", 50000),
            new Employee(2, "Surekha Sonawane", 60000),
            new Employee(3, "Ashwini Meshram", 70000)
        );

        employees.forEach(Employee::displayDetails);
    }
}
