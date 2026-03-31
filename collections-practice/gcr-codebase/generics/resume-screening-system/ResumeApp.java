import java.util.ArrayList;
import java.util.List;

public class ResumeApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 =
                new Resume<>("Amit", new SoftwareEngineer(), 3);
        Resume<DataScientist> r2 =
                new Resume<>("Riya", new DataScientist(), 2);
        Resume<ProductManager> r3 =
                new Resume<>("Rahul", new ProductManager(), 5);
        ResumeProcessor.processResume(r1);
        ResumeProcessor.processResume(r2);
        ResumeProcessor.processResume(r3);
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());
        ResumeProcessor.screenCandidates(roles);
    }
}
