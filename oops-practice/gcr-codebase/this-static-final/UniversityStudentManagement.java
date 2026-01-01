class Student {

    // Static
    static String universityName = "Global University";
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final
    final int rollNumber;

    // Constructor 
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    // Static Method 
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Update Grade 
    void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }

    //  Display 
    void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

//  Main Class 
public class UniversityStudentManagement {
    public static void main(String[] args) {

        Student s1 = new Student(
                101,
                "Hemashree",
                "A"
        );

        Student s2 = new Student(
                102,
                "Sharmila",
                "B"
        );

        // Display total students
        Student.displayTotalStudents();

        // instanceof 
        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        // Update grade for student 2
        if (s2 instanceof Student) {
            s2.updateGrade("A");
            s2.displayStudentDetails();
        }
    }
}
