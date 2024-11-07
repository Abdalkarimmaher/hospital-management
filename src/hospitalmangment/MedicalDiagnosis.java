/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmangment;

/**
 *
 * @author USER
 */
    import java.util.List;

public class MedicalDiagnosis {
    private double height; // in meters or cm
    private double weight; // in kg
    private List<String> chronicDiseases; // List of chronic diseases
    private List<String> symptoms; // List of patient symptoms
    private String selectedDisease; // Disease diagnosed

    // Constructor
    public MedicalDiagnosis(double height, double weight, List<String> chronicDiseases, List<String> symptoms) {
        this.height = height;
        this.weight = weight;
        this.chronicDiseases = chronicDiseases;
        this.symptoms = symptoms;
        this.selectedDisease = null; // Initially, no disease selected
    }

    // Calculate BMI (Body Mass Index) based on height and weight
    public double calculateBMI() {
        return weight / (height * height); // BMI formula: weight(kg) / height(m^2)
    }

    // Method to diagnose based on symptoms (simplified)
    public void diagnoseDisease(List<String> possibleDiseases) {
        for (String disease : possibleDiseases) {
            // In a real system, this could be more complex (e.g., using symptom mapping to diseases)
            if (matchesSymptoms(disease)) {
                this.selectedDisease = disease;
                break;
            }
        }
    }

    // Helper method to simulate matching of symptoms to diseases
    private boolean matchesSymptoms(String disease) {
        // Example logic: matches a symptom to a predefined disease (can be replaced by actual logic)
        if (disease.equalsIgnoreCase("Flu") && symptoms.contains("Fever")) {
            return true;
        } else if (disease.equalsIgnoreCase("Diabetes") && chronicDiseases.contains("Diabetes")) {
            return true;
        }
        // Add more conditions for other diseases
        return false;
    }

    // Add a chronic disease to the list
    public void addChronicDisease(String disease) {
        if (!chronicDiseases.contains(disease)) {
            chronicDiseases.add(disease);
        }
    }

    // Get the diagnosed disease
    public String getDiagnosedDisease() {
        return selectedDisease;
    }

    // Getters and Setters for attributes
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getChronicDiseases() {
        return chronicDiseases;
    }

    public void setChronicDiseases(List<String> chronicDiseases) {
        this.chronicDiseases = chronicDiseases;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}

    

