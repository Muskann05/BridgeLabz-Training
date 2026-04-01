// Employee.java

class Employee {

    // Static
    static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;

    // Instance variables 
    String name;
    String designation;

    // Final 
    final int id;

    // Constructor 
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static Method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    // Display
    void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
                101,
                "Thamarai",
                "Software Engineer"
        );
        Employee emp2 = new Employee(
                102,
                "Rohan",
                "Project Manager"
        );
        // Display total employees
        Employee.displayTotalEmployees();
        // instanceof
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }
    }
}
