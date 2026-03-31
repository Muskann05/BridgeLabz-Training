import java.util.ArrayList;
import java.util.List;
public class UniversitySystem {
    public static void main(String[] args) {

        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse("Calculus", 4));
        Course<AssignmentCourse> cs = new Course<>("Computer Science", new AssignmentCourse("Data Structures", 5));
        Course<ResearchCourse> research = new Course<>("Physics", new ResearchCourse("Quantum Research", 6));

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math.getCourseType());
        allCourses.add(cs.getCourseType());
        allCourses.add(research.getCourseType());

        UniversityUtils.displayCourses(allCourses);
    }
}
