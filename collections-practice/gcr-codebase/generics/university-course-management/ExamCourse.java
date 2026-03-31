public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, int credits) {
        super(courseName, credits);
    }
    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}
