import java.util.*;

// perform CRUD operations
public class HospitalManagement {
    private List<Patient> patients = new ArrayList<>();

    // CREATE
    public void addPatient(Patient p) {
        patients.add(p);
    }

    // READ
    public void displayPatients() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    // DELETE
    public void removePatient(int id) {
        patients.removeIf(p -> p.getPatientId() == id);
    }
}
