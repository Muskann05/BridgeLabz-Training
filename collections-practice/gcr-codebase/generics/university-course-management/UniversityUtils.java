import java.util.List;
public class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("University Courses");
        for (CourseType course : courses) {
            System.out.println(
                "Course: " + course.getCourseName() +
                ", Credits: " + course.getCredits() +
                ", Evaluation: " + course.getEvaluationType()
            );
        }
    }
}
