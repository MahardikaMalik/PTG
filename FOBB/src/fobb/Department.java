/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fobb;

/**
 *
 * @author mahardikamalik
 */
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Doctor> doctors;
    private int roomCount;
    
    public Department(String name, int roomCount) {
        this.name = name;
        this.roomCount = roomCount;
        this.doctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        if (doctor.getDepartment().equals(name)) {
            doctors.add(doctor);
            System.out.println("Dr. " + doctor.getName() + " added to " + name + " department.");
        } else {
            System.out.println("Doctor's department doesn't match!");
        }
    }
    
    public void displayDepartmentInfo() {
        System.out.println("=== " + name.toUpperCase() + " DEPARTMENT ===");
        System.out.println("Rooms available: " + roomCount);
        System.out.println("Doctors in department: " + doctors.size());
        
        System.out.println("\nDoctors List:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i).getName() + 
                             " - " + doctors.get(i).getSpecialization());
        }
    }
    
    public Doctor findAvailableDoctor() {
    for (int i = 0; i < doctors.size(); i++) {
        Doctor doctor = doctors.get(i);
        if (doctor.isAvailable()) {
            return doctor;
        }
    }
    return null;
}
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
    @Override
    public String toString() {
        return name + " Department with " + doctors.size() + " doctors";
    }
}