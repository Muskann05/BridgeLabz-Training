package com.healthclinic.HealthClinicApp;
public class Doctor {
    private int doctorId;
    private String name;
    private int specializationId;
    private String contact;
    private double consultationFee;

    public Doctor(String name, int specializationId, String contact, double consultationFee) {
        this.name = name;
        this.specializationId = specializationId;
        this.contact = contact;
        this.consultationFee = consultationFee;
    }

    public int getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public int getSpecializationId() { return specializationId; }
    public String getContact() { return contact; }
    public double getConsultationFee() { return consultationFee; }
}