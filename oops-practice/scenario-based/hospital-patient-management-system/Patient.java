// class of patient
public class Patient {
    private int patientId;
    private String name;
    private int age;
    protected Doctor doctor;

// constructor
    public Patient(int patientId, String name, int age, Doctor doctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        doctor.displayDoctor();
    }
}
