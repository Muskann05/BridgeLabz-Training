import java.util.ArrayList;
import java.util.List;


  // Interface: Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

 // Abstract Class: Employee 
abstract class Employee implements Department {

    // Encapsulation: private fields
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
    }

    // Getters & Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Interface methods
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

 // FullTimeEmployee Class
 
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); 
    }
}

 // PartTimeEmployee Class
 
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
 // Main Class

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Polymorphism: Employee reference
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Anita", 80, 500);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Display employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
