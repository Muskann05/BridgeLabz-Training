package com.healthclinic.HealthClinicApp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientDAO patientDAO = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        VisitDAO visitDAO = new VisitDAO();
        BillingDAO billingDAO = new BillingDAO();
        while (true) {
            System.out.println("Health Clinic Management System");
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Book Appointment");
            System.out.println("5. View Daily Schedule");
            System.out.println("6. Record Visit");
            System.out.println("7. Generate Bill");
            System.out.println("8. Record Payment");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("DOB (YYYY-MM-DD): ");
                    String dob = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Blood Group: ");
                    String bloodGroup = sc.nextLine();
                    Patient patient = new Patient(name, dob, contact, email, address, bloodGroup);
                    System.out.println(patientDAO.addPatient(patient) ? "Patient registered." : "Failed to register.");
                    break;
                case 2:
                    System.out.print("Enter patient name: ");
                    String searchName = sc.nextLine();
                    patientDAO.searchPatientByName(searchName);
                    break;
                case 3:
                    System.out.print("Doctor Name: ");
                    String docName = sc.nextLine();
                    System.out.print("Specialization ID: ");
                    int specId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Contact: ");
                    String docContact = sc.nextLine();
                    System.out.print("Consultation Fee: ");
                    double fee = sc.nextDouble();
                    Doctor doctor = new Doctor(docName, specId, docContact, fee);
                    System.out.println(doctorDAO.addDoctor(doctor) ? "Doctor added." : "Failed to add doctor.");
                    break;
                case 4:
                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Date (YYYY-MM-DD): ");
                    String adate = sc.nextLine();
                    System.out.print("Time (HH:MM:SS): ");
                    String atime = sc.nextLine();

                    System.out.println(appointmentDAO.bookAppointment(pid, did, adate, atime)
                            ? "Appointment booked." : "Failed to book appointment.");
                    break;

                case 5:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    appointmentDAO.viewDailySchedule(date);
                    break;

                case 6:
                    System.out.print("Appointment ID: ");
                    int appId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Diagnosis: ");
                    String diagnosis = sc.nextLine();
                    System.out.print("Notes: ");
                    String notes = sc.nextLine();

                    System.out.println(visitDAO.recordVisit(appId, diagnosis, notes)
                            ? "Visit recorded." : "Failed to record visit.");
                    break;

                case 7:
                    System.out.print("Visit ID: ");
                    int visitId = sc.nextInt();
                    System.out.print("Total Amount: ");
                    double amount = sc.nextDouble();

                    System.out.println(billingDAO.generateBill(visitId, amount)
                            ? "Bill generated." : "Failed to generate bill.");
                    break;

                case 8:
                    System.out.print("Bill ID: ");
                    int billId = sc.nextInt();
                    System.out.print("Payment Amount: ");
                    double payAmount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Payment Mode: ");
                    String mode = sc.nextLine();

                    System.out.println(billingDAO.recordPayment(billId, payAmount, mode)
                            ? "Payment recorded." : "Failed to record payment.");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}