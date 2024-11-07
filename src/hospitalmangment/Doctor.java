/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmangment;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USER
 */
public class Doctor {
    private int doctor_id;
    private String name;
    private int years_of_experience;
    private String specialization;
    private LocalDate birth_day; 
    private int age;
    private LocalDate startDay;
    public static int newDoctorCount = 0;

    public Doctor() {
        LocalDate start = LocalDate.now();
        LocalDate birthday = LocalDate.now();
        this(0, "", "", start, birthday);
        
    }

    public Doctor(int doctor_id, String name, String specialization, LocalDate startDay, LocalDate birth_day) {
        this.doctor_id = doctor_id;
        this.name = name;
        this.specialization = specialization;
        this.startDay = startDay;
        this.birth_day = birth_day;
        this.years_of_experience = calculateExperience(startDay);
        this.age = calculateAge(birth_day);
        newDoctorCount++;
    }

    public int calculateExperience(LocalDate startDate) {
        LocalDate currentDate = LocalDate.now();
        Period experience = Period.between(startDate, currentDate);
        return experience.getYears();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Doctor{" + "doctor_id=" + doctor_id + ", name=" + name + ", years_of_experience=" + years_of_experience
                + ", specialization=" + specialization + ", birth_day=" + birth_day.format(formatter) 
                + ", age=" + age + '}';
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public String getName() {
        return name;
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public LocalDate getBirthDay() {
        return birth_day;
    }

    public int getAge() {
        return age;
    }

    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    }

   

    public  static void dropDoctor() {
        newDoctorCount--;
    }
}

