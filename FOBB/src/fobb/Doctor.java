/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fobb;

/**
 *
 * @author mahardikamalik
 */
public class Doctor {
    private String name;
    private String specialization;
    private String department;
    private boolean isAvailable;
    
    public Doctor(String name, String specialization, String department) {
        this.name = name;
        this.specialization = specialization;
        this.department = department;
        this.isAvailable = true;
    }
    
    public void assignPatient() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(name + " is now busy with a patient.");
        } else {
            System.out.println(name + " is not available.");
        }
    }
    
    public void completeAppointment() {
        isAvailable = true;
        System.out.println(name + " is now available for new patients.");
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void displayInfo() {
        System.out.println("Dr. " + name + " - " + specialization);
        System.out.println("  Department: " + department);
        System.out.println("  Available: " + (isAvailable ? "Yes" : "No"));
    }
    
    @Override
    public String toString() {
        return "Dr. " + name + " (" + specialization + ")";
    }
}
