import java.util.Scanner;

// Base class Employee
class Employee {
    public int employeeID;       // Public member
    protected String department; // Protected member
    private double salary;       // Private member

    // Constructor to initialize Employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager to demonstrate access
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Display Manager details
    public void displayManager() {
        System.out.println("Employee ID: " + employeeID);   // public
        System.out.println("Department: " + department);   // protected
        System.out.println("Salary: " + getSalary());      // private via getter
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter details for Employee:");
        System.out.print("Employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empID, dept, salary);
        System.out.println("\nEmployee Details:");
        emp.displayEmployee();

        // Modify Salary
        System.out.print("\nEnter new Salary to update: ");
        double newSalary = sc.nextDouble();
        emp.setSalary(newSalary);
        System.out.println("Updated Employee Details:");
        emp.displayEmployee();
        sc.nextLine(); 

        // Input for Manager
        System.out.println("\nEnter details for Manager:");
        System.out.print("Employee ID: ");
        int mgrID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Department: ");
        String mgrDept = sc.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = sc.nextDouble();
        System.out.print("Team Size: ");
        int teamSize = sc.nextInt();

        Manager mgr = new Manager(mgrID, mgrDept, mgrSalary, teamSize);
        System.out.println("\nManager Details:");
        mgr.displayManager();
    }
}
