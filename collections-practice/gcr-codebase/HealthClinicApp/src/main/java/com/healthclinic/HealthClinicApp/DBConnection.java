package com.healthclinic.HealthClinicApp;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/health_clinic";
    private static final String USER = "root";
    private static final String PASSWORD = "Mypassword@123";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        if(con != null) {
            System.out.println("Connection test passed!");
        } else {
            System.out.println("Connection test failed!");
        }
    }
}