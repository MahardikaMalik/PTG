/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fobb;

/**
 *
 * @author mahardikamalik
 */
public class Patient {
    private String name;
    private int age;
    private String medicalCondition;
    private Doctor assignedDoctor;
    
    public Patient(String name, int age, String medicalCondition) {
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.assignedDoctor = null;
    }
    
    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
        System.out.println(name + " assigned to Dr. " + doctor.getName());
    }
    
    public void showMedicalDetails() {
        System.out.println("Patient: " + name + " (Age: " + age + ")");
        System.out.println("Condition: " + medicalCondition);
        if (assignedDoctor != null) {
            System.out.println("Doctor: Dr. " + assignedDoctor.getName());
        } else {
            System.out.println("Doctor: Not assigned yet");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getMedicalCondition() {
        return medicalCondition;
    }
    
    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }
    
    @Override
    public String toString() {
        return "Patient: " + name + ", Condition: " + medicalCondition;
    }
}
