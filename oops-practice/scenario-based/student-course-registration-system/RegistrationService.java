public abstract class RegistrationService {
    public abstract void enrollCourse(String course) throws CourseLimitExceededException;
    public abstract void dropCourse(String course);
    public abstract void viewGrades();
}
