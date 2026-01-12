import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    // Encapsulation
    private String studentId;
    private List<String> courses;
    private List<String> grades;
    private final int MAX_COURSES = 3;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    // Enroll Course
    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (courses.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded!");
        }
        courses.add(course);
        grades.add("Not Assigned");
        System.out.println("Enrolled in course: " + course);
    }

    // Drop Course
    public void dropCourse(String course) {
        int index = courses.indexOf(course);
        if (index != -1) {
            courses.remove(index);
            grades.remove(index);
            System.out.println("Dropped course: " + course);
        } else {
            System.out.println("Course not found!");
        }
    }

    // Assign Grade
    public void assignGrade(String course, String grade) {
        int index = courses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
        }
    }

    // View Grades
    public void viewGrades() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student ID: " + studentId);

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + " : " + grades.get(i));
        }
    }
}
