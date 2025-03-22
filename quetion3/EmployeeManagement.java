import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "sandhya bhosale", 50000);
        Employee emp2 = new Employee(2, "surekha sonawane", 60000);
        Employee emp3 = new Employee(3, "Ashwini meshram", 70000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
