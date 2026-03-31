package com.healthclinic.HealthClinicApp;
import com.healthclinic.HealthClinicApp.DBConnection;
import java.sql.*;
public class DoctorDAO {
    public boolean addDoctor(Doctor doctor) {
        String sql = "INSERT INTO doctors(name, specialization_id, contact, consultation_fee)";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, doctor.getName());
            ps.setInt(2, doctor.getSpecializationId());
            ps.setString(3, doctor.getContact());
            ps.setDouble(4, doctor.getConsultationFee());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}