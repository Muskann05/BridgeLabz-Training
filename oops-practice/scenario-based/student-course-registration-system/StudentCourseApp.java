public class StudentCourseApp {

    public static void main(String[] args) {

        Student student = new Student("Rohan", 20, "STU101");

        try {
            student.enrollCourse("Java");
            student.enrollCourse("Python");
            student.enrollCourse("Data Structures");

            // This will throw exception
            student.enrollCourse("Machine Learning");

        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        student.assignGrade("Java", "A");
        student.assignGrade("Python", "B+");

        student.dropCourse("Data Structures");

        student.viewGrades();
    }
}
