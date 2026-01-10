// class of doctor
public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

// constructor
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("Doctor: " + name + " (" + specialization + ")");
    }
}
