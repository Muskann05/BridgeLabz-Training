package com.healthclinic.HealthClinicApp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class UnitTest {

    @Test
    public void Test_AddPatient() {
        PatientDAO dao = new PatientDAO();
        Patient patient = new Patient("Test User", "2000-01-01", "9999999999", "test@example.com", "Test Address", "O+");
        boolean result = dao.addPatient(patient);
        assertEquals(true, result);
    }

    @Test
    public void Test_AddDoctor() {
        DoctorDAO dao = new DoctorDAO();
        Doctor doctor = new Doctor("Dr Test", 1, "8888888888", 500);
        boolean result = dao.addDoctor(doctor);
        assertEquals(true, result);
    }

    @Test
    public void Test_BookAppointment() {
        AppointmentDAO dao = new AppointmentDAO();
        boolean result = dao.bookAppointment(1, 1, "2026-02-12", "10:00:00");
        assertEquals(true, result);
    }

    @Test
    public void Test_RecordVisit() {
        VisitDAO dao = new VisitDAO();
        boolean result = dao.recordVisit(1, "Fever", "Patient recovering well");
        assertEquals(true, result);
    }

    @Test
    public void Test_GenerateBill() {
        BillingDAO dao = new BillingDAO();
        boolean result = dao.generateBill(1, 500);
        assertEquals(true, result);
    }

    @Test
    public void Test_RecordPayment() {
        BillingDAO dao = new BillingDAO();
        boolean result = dao.recordPayment(1, 500, "Cash");
        assertEquals(true, result);
    }
}