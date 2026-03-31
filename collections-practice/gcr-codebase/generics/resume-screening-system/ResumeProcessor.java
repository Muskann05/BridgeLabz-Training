import java.util.List;

public class ResumeProcessor {

    // Generic Method with Bounded Type Parameter
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing Resume");
        System.out.println("Candidate: " + resume.getCandidateName());
        System.out.println("Role: " + resume.getJobRole().getRoleName());
        System.out.println("Required Skills: " + resume.getJobRole().getRequiredSkills());
        System.out.println("Experience: " + resume.getExperienceYears() + " years");
    }

    // Wildcard Method
    public static void screenCandidates(List<? extends JobRole> roles) {
        System.out.println("Screening Pipeline Roles");
        for (JobRole role : roles) {
            System.out.println("Screening for: " + role.getRoleName());
        }
    }
}
