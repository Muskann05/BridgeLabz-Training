package com.healthclinic.HealthClinicApp;
import com.healthclinic.HealthClinicApp.DBConnection;
import java.sql.*;
public class BillingDAO {
    public boolean generateBill(int visitId, double amount) {
        String sql = "INSERT INTO bills(visit_id, total_amount, payment_status) VALUES (?, ?, ?)";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, visitId);
            ps.setDouble(2, amount);
            ps.setString(3, "UNPAID");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean recordPayment(int billId, double amount, String mode) {
        String updateBill = "UPDATE bills SET payment_status='PAID' WHERE bill_id=?";
        String insertPayment = "INSERT INTO payment_transactions(bill_id, payment_date, payment_mode, amount) VALUES (?, CURDATE(), ?, ?)";
        try(Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try (PreparedStatement ps1 = con.prepareStatement(updateBill);
                 PreparedStatement ps2 = con.prepareStatement(insertPayment)) {
                ps1.setInt(1, billId);
                ps1.executeUpdate();
                ps2.setInt(1, billId);
                ps2.setString(2, mode);
                ps2.setDouble(3, amount);
                ps2.executeUpdate();
                con.commit();
                return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}