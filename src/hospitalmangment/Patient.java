/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmangment;

import java.time.LocalDate;

/**
 *
 * @author hp
 */
public class Patient {
    private int ID;
    private String name;
    private String major;
    private LocalDate birthday;
    private char gender;
    private String natinality;
    private static int numofpatient;

    public Patient(int ID, String name, String major, LocalDate birthday, char gender, String natinality) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.birthday = birthday;
        this.gender = gender;
        this.natinality = natinality;
    }
    
    

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public char getGender() {
        return gender;
    }

    public String getNatinality() {
        return natinality;
    }

    public static int getNumofpatient() {
        return numofpatient;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setNatinality(String natinality) {
        this.natinality = natinality;
    }

    public static void setNumofpatient(int numofpatient) {
        Patient.numofpatient = numofpatient;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + ", name=" + name + ", major=" + major + ", birthday=" + birthday + ", gender=" + gender + ", natinality=" + natinality + '}';
    }


    
    
}
