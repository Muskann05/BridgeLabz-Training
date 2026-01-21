public class Course<T extends CourseType> {
    private String department;
    private T courseType;
    public Course(String department, T courseType) {
        this.department = department;
        this.courseType = courseType;
    }
    public String getDepartment() {
        return department;
    }
    public T getCourseType() {
        return courseType;
    }
}
