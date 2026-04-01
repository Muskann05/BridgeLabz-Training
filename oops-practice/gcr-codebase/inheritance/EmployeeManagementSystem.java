// Base class
class Employee {

    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Manager subclass
class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); 
        this.teamSize = teamSize;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

// Developer subclass
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language : " + programmingLanguage);
    }
}

// Intern subclass
class Intern extends Employee {

    int duration; 

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration : " + duration + " months");
    }
}

// Main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new Manager("Amit", 101, 80000, 10);
        Employee e2 = new Developer("Neha", 102, 60000, "Java");
        Employee e3 = new Intern("Rahul", 103, 15000, 6);

        System.out.println(" Manager Details ");
        e1.displayDetails();

        System.out.println(" Developer Details ");
        e2.displayDetails();

        System.out.println(" Intern Details ");
        e3.displayDetails();
    }
}
