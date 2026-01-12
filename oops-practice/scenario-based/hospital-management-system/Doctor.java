public class Doctor extends Person {

    private int doctorId;
    private String specialization;

    public Doctor(int doctorId, String name, int age, String specialization) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    // Polymorphism: Consultation fee calculation
    public double calculateConsultationFee() {
        return 500.0;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor: " + name + " | Specialization: " + specialization);
    }
}
