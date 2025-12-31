import java.util.Scanner;

class Course {

    // instance variables
    String courseName;
    // in months
    int duration;      
    double fee;

    // class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Course Fee: " + fee);
        
    }

    // class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Institute Name:");
        String instName = sc.nextLine();
        Course.updateInstituteName(instName);

        System.out.println("Enter number of courses:");
        int n = sc.nextInt();
        // consume newline
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter course " + i + " name:");
            String cname = sc.nextLine();

            System.out.println("Enter duration (in months):");
            int duration = sc.nextInt();

            System.out.println("Enter course fee:");
            double fee = sc.nextDouble();
            // consume newline

            sc.nextLine(); 
            Course c = new Course(cname, duration, fee);
            c.displayCourseDetails();
        }

        
    }
}
