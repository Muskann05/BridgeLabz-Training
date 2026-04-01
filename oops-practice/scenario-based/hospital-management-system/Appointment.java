public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private boolean isBooked;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.isBooked = false;
    }

    public void book() throws AppointmentNotAvailableException {
        if (isBooked) {
            throw new AppointmentNotAvailableException("Appointment already booked!");
        }
        isBooked = true;
        System.out.println("Appointment booked for patient: " + patient.name);
    }

    public void cancel() {
        isBooked = false;
        System.out.println("Appointment cancelled.");
    }
}
