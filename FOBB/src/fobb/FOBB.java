/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fobb;

/**
 *
 * @author mahardikamalik
 */
import java.util.ArrayList;

public class FOBB {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");
        
        Department cardiology = new Department("Cardiology", 10);
        Department neurology = new Department("Neurology", 8);
        Department generalSurgery = new Department("General Surgery", 12);
        
        Doctor drAli = new Doctor("Ali", "Cardiologist", "Cardiology");
        Doctor drSiti = new Doctor("Siti", "Neurologist", "Neurology");
        Doctor drAhmad = new Doctor("Ahmad", "Surgeon", "General Surgery");
        Doctor drFatimah = new Doctor("Fatimah", "Cardiologist", "Cardiology");

        cardiology.addDoctor(drAli);
        cardiology.addDoctor(drFatimah);
        neurology.addDoctor(drSiti);
        generalSurgery.addDoctor(drAhmad);
        
        Patient patient1 = new Patient("John", 45, "Heart Condition");
        Patient patient2 = new Patient("Will", 32, "Migraine");
        Patient patient3 = new Patient("Mike", 60, "Appendicitis");
        
        System.out.println("\n--- DEPARTMENT INFORMATION ---");
        cardiology.displayDepartmentInfo();
        System.out.println();
        neurology.displayDepartmentInfo();
        
        System.out.println("\n--- SCHEDULING APPOINTMENTS ---");
        Appointment app1 = new Appointment(patient1, drAli, "2025-01-15", "10:00 AM");
        Appointment app2 = new Appointment(patient2, drSiti, "2025-01-15", "11:30 AM");
        Appointment app3 = new Appointment(patient3, drAhmad, "2025-01-16", "2:00 PM");
        
        System.out.println("\n--- APPOINTMENT DETAILS ---");
        app1.displayAppointmentDetails();
        System.out.println();
        app2.displayAppointmentDetails();
        
        System.out.println("\n--- COMPLETING APPOINTMENTS ---");
        app1.completeAppointment();
        app2.completeAppointment();
        
        System.out.println("\n--- PATIENT INFORMATION ---");
        System.out.println(patient1.toString());
        System.out.println(patient2.toString());
        System.out.println(patient3.toString());
        
        System.out.println("\n--- FINDING AVAILABLE DOCTORS ---");
        Doctor availableDoc = cardiology.findAvailableDoctor();
        if (availableDoc != null) {
            System.out.println("Available doctor in Cardiology: Dr. " + availableDoc.getName());
        } else {
            System.out.println("No available doctors in Cardiology");
        }
        
        System.out.println("\n--- ALL DOCTORS LIST ---");
        Doctor[] allDoctors = {drAli, drSiti, drAhmad, drFatimah};
        for (int i = 0; i < allDoctors.length; i++) {
            allDoctors[i].displayInfo();
            System.out.println();
        }
        
        System.out.println("\n--- ALL APPOINTMENTS ---");
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments.add(app1);
        appointments.add(app2);
        appointments.add(app3);
        
        for (Appointment app : appointments) {
            System.out.println(app.toString());
        }
        
        System.out.println("\n=== SYSTEM TEST COMPLETE ===");
    }
}