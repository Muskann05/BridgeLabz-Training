public class HospitalApp implements HospitalService {

    public void addPatient(Patient patient) {
        System.out.println("Patient added: " + patient.name);
    }

    public void addDoctor(Doctor doctor) {
        doctor.displayDoctorDetails();
    }

    public void bookAppointment(Appointment appointment)
            throws AppointmentNotAvailableException {
        appointment.book();
    }

    public static void main(String[] args) {

        HospitalApp hospital = new HospitalApp();

        Patient p1 = new Patient(101, "Rohan", 25);
        p1.addMedicalRecord("Fever");
        p1.addMedicalRecord("Cold");

        Doctor d1 = new Doctor(201, "Dr. Sharma", 45, "Cardiologist");

        hospital.addPatient(p1);
        hospital.addDoctor(d1);

        Appointment appointment = new Appointment(p1, d1);

        try {
            hospital.bookAppointment(appointment);
            hospital.bookAppointment(appointment); // exception
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        p1.viewMedicalHistory();
        System.out.println("Consultation Fee: ₹" + d1.calculateConsultationFee());
    }
}
