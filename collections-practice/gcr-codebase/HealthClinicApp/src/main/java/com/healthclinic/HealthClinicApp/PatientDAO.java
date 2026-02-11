package com.healthclinic.HealthClinicApp;
import java.sql.*;
import com.healthclinic.HealthClinicApp.DBConnection;
public class PatientDAO {
    public boolean addPatient(Patient patient) {
        String sql = "INSERT INTO patients(name, dob, contact, email, address, blood_group)";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, patient.getName());
            ps.setString(2, patient.getDob());
            ps.setString(3, patient.getContact());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void searchPatientByName(String name) {
        String sql = "SELECT * FROM patients WHERE name LIKE ?";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("patient_id") +
                        ", Name: " + rs.getString("name") +
                        ", Contact: " + rs.getString("contact"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}