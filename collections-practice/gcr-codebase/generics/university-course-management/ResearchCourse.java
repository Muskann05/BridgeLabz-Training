public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, int credits) {
        super(courseName, credits);
    }
    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}
