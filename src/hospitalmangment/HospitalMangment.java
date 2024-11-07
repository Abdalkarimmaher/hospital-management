/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmangment;

import java.time.LocalDate;



/**
 *
 * @author USER
 */

public class HospitalMangment {
    public static void main(String[] args) {
        LocalDate startDay = LocalDate.of(2015, 10, 23); 
        LocalDate birthDay = LocalDate.of(1980, 8, 25);
        Doctor doctor1 = new Doctor(1, "Dr. John Smith", "Cardiology", startDay, birthDay);
        System.out.println(doctor1);
    }
    
}
