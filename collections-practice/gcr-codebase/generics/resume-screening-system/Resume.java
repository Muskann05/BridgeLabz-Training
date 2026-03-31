public class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private int experienceYears;
    public Resume(String candidateName, T jobRole, int experienceYears) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.experienceYears = experienceYears;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public T getJobRole() {
        return jobRole;
    }
    public int getExperienceYears() {
        return experienceYears;
    }
}
