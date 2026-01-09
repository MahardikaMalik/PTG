/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fobb;

/**
 *
 * @author mahardikamalik
 */
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;
    
    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Scheduled";
        
        patient.assignDoctor(doctor);
        doctor.assignPatient();
    }
    
    public void completeAppointment() {
        status = "Completed";
        doctor.completeAppointment();
        System.out.println("Appointment completed for " + patient.getName());
    }
    
    public void displayAppointmentDetails() {
        System.out.println("=== APPOINTMENT DETAILS ===");
        System.out.println("Date: " + date + " at " + time);
        System.out.println("Status: " + status);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: Dr. " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
    }
    
    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "Appointment: " + patient.getName() + " with Dr. " + doctor.getName() + 
               " on " + date + " at " + time;
    }
}
