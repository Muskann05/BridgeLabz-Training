package com.healthclinic.HealthClinicApp;
import com.healthclinic.HealthClinicApp.DBConnection;
import java.sql.*;
public class AppointmentDAO {
    public boolean bookAppointment(int patientId, int doctorId, String date, String time) {
        String sql = "INSERT INTO appointments(patient_id, doctor_id, appointment_date, appointment_time, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, date);
            ps.setString(4, time);
            ps.setString(5, "SCHEDULED");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void viewDailySchedule(String date) {
        String sql = "SELECT p.name AS patient, d.name AS doctor, a.appointment_time " +
                     "FROM appointments a " +
                     "JOIN patients p ON a.patient_id = p.patient_id " +
                     "JOIN doctors d ON a.doctor_id = d.doctor_id " +
                     "WHERE a.appointment_date = ? " +
                     "ORDER BY a.appointment_time";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, date);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("Time: " + rs.getString("appointment_time") +
                        ", Patient: " + rs.getString("patient") +
                        ", Doctor: " + rs.getString("doctor"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}