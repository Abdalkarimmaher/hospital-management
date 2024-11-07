/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmangment;

/**
 *
 * @author USER
 */
 import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class Appointment {



    // Attributes for an individual appointment
    private String doctorName;
    private LocalDate date;
    private LocalTime time;

    // Static list to hold multiple available appointments
    private static List<Appointment> availableAppointments = new ArrayList<>();
    private static List<Appointment> bookedAppointments = new ArrayList<>();

    // Constructor to create an appointment
    public Appointment(String doctorName, LocalDate date, LocalTime time) {
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
    }

    // Method to add appointments to the available list
    public static void addAvailableAppointment(String doctorName, LocalDate date, LocalTime time) {
        availableAppointments.add(new Appointment(doctorName, date, time));
    }

    // Method to choose an appointment from the available ones
    public static boolean chooseAppointment(String doctorName, LocalDate date, LocalTime time) {
        for (Appointment appointment : availableAppointments) {
            if (appointment.getDoctorName().equalsIgnoreCase(doctorName) && 
                appointment.getDate().equals(date) &&
                appointment.getTime().equals(time)) {

                bookedAppointments.add(appointment);
                availableAppointments.remove(appointment); // Remove from available
                System.out.println("Appointment booked with " + doctorName + " on " + date + " at " + time);
                return true; // Appointment successfully booked
            }
        }
        System.out.println("Appointment not available.");
        return false; // Appointment not found
    }

    // Method to cancel a booked appointment
    public static boolean cancelAppointment(String doctorName, LocalDate date, LocalTime time) {
        for (Appointment appointment : bookedAppointments) {
            if (appointment.getDoctorName().equalsIgnoreCase(doctorName) &&
                appointment.getDate().equals(date) &&
                appointment.getTime().equals(time)) {

                bookedAppointments.remove(appointment); // Remove from booked
                availableAppointments.add(appointment); // Add back to available
                System.out.println("Appointment canceled with " + doctorName + " on " + date + " at " + time);
                return true; // Appointment successfully canceled
            }
        }
        System.out.println("No such appointment to cancel.");
        return false; // Appointment not found
    }

    // Getters for appointment attributes
    public String getDoctorName() {
        return doctorName;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    // Method to display available appointments
    public static void displayAvailableAppointments() {
        if (availableAppointments.isEmpty()) {
            System.out.println("No available appointments.");
        } else {
            System.out.println("Available Appointments:");
            for (Appointment appointment : availableAppointments) {
                System.out.println("Doctor: " + appointment.getDoctorName() +
                        ", Date: " + appointment.getDate() +
                        ", Time: " + appointment.getTime());
            }
        }
    }
}

    

