package com.healthclinic.HealthClinicApp;
import com.healthclinic.HealthClinicApp.DBConnection;
import java.sql.*;
public class VisitDAO {
    public boolean recordVisit(int appointmentId, String diagnosis, String notes) {
        String sql = "INSERT INTO visits(appointment_id, diagnosis, notes, visit_date) VALUES (?, ?, ?, CURDATE())";
        try(Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try(PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, appointmentId);
                ps.setString(2, diagnosis);
                ps.setString(3, notes);
                ps.executeUpdate();
            }
            String updateAppointment = "UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?";
            try(PreparedStatement ps2 = con.prepareStatement(updateAppointment)) {
                ps2.setInt(1, appointmentId);
                ps2.executeUpdate();
            }
            con.commit();
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}