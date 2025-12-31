import java.util.Scanner;

// Base class Student
class Student {
    public int rollNumber;        // Public member
    protected String name;        // Protected member
    private double CGPA;          // Private member

    // Constructor to initialize Student
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass for Postgraduate Student
class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display PG student details
    public void displayPGStudent() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("CGPA: " + getCGPA());        // private via getter
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Student
        System.out.println("Enter details for Student:");
        System.out.print("Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

        Student s1 = new Student(roll, name, cgpa);
        System.out.println("\nStudent Details:");
        s1.displayStudent();

        // Update CGPA
        System.out.print("\nEnter new CGPA to update: ");
        double newCGPA = sc.nextDouble();
        s1.setCGPA(newCGPA);
        System.out.println("Updated Student Details:");
        s1.displayStudent();

        sc.nextLine(); 

        // Input for Postgraduate Student
        System.out.println("\nEnter details for Postgraduate Student:");
        System.out.print("Roll Number: ");
        int pgRoll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Name: ");
        String pgName = sc.nextLine();
        System.out.print("CGPA: ");
        double pgCGPA = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        String specialization = sc.nextLine();

        PostgraduateStudent pg = new PostgraduateStudent(pgRoll, pgName, pgCGPA, specialization);
        System.out.println("\nPostgraduate Student Details:");
        pg.displayPGStudent();

    }
}
