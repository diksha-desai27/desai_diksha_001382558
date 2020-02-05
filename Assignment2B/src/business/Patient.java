/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dikshadesai
 */
public class Patient {

    private String name;
    private String dateOfBirth;
    private String ageGroup;
    private VitalSigns vitalSigns;
    private VitalSignHistory vitalSignHistory = new VitalSignHistory();
    // private List<VitalSigns> newList = new ArrayList<>();

    Patient() {

    }

    Patient(VitalSigns vs) {
        this.vitalSigns = vs;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void calculateAge(LocalDate dob) {
        System.out.println("called calculateage");
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dob, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        System.out.println("Your age is: " + years + " years " + months + " months " + days + " days");
        getAgeGroup(years, months, days);

    }

    public VitalSigns newVitalSign(float rr, float hr, float bp, float w, float wp) {
        vitalSigns = new VitalSigns(rr, hr, bp, w, wp);
        vitalSignHistory.addVitalSigns(vitalSigns);
        return vitalSigns;
    }

    public void getAgeGroup(int years, int months, int days) {
        if (years == 0 && months == 0 && (days >= 0 && days <= 30)) {
            System.out.println("Your age group is New Born");
            ageGroup = "NewBorn";
        } else if (years == 0 && (months >= 1 && months <= 12)) {
            System.out.println("Your age group is Infant");
            ageGroup = "Infant";
        } else if (years >= 1 && years <= 3) {
            System.out.println("Your age group is Toddler");
            ageGroup = "Toddler";
        } else if (years > 3 && years <= 5) {
            System.out.println("Your age group is Preschool");
            ageGroup = "Preschooler";
        } else if (years >= 6 && years <= 12) {
            System.out.println("Your age group is School Age");
            ageGroup = "School Age";
        } else if (years >= 13) {
            System.out.println("Your age group is Adolscent");
            ageGroup = "Adolscent";
        } else {
            System.out.println("Please enter a valid birthdate");
        }
    }

    public void displayDetails(List<Patient> patients) {
        int i = 1;
        String name = "";

        for (Patient p : patients) {
            if (name.equals(p.getName()) || name.equals("")) {
                if (name.equals("")) {
                    System.out.println("\n" + p.getName());
                }
                System.out.println("Vital Signs: " + i);
            } else {
                i = 1;
                System.out.println("\n" + p.getName());
                System.out.println("Vital Signs: " + i);
            }
            System.out.println(p.getVitalSigns().getRespiratoryRate());
            System.out.println(p.getVitalSigns().getBloodPressure());
            System.out.println(p.getVitalSigns().getHeartRate());
            System.out.println(p.getVitalSigns().getWeight());
            System.out.println(p.getVitalSigns().getWeightInPounds());
            name = p.getName();
            i++;
        }
    }

    public boolean isThisVitalSignNormal(String vsign) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(this.dateOfBirth, formatter);
        calculateAge(localDate);
        
        // VitalSigns vitalSigns = vitalSignHistory.getVitalSignHistory().get(vitalSignHistory.getVitalSignHistory().size()-1);
//        System.out.println(vitalSigns);
//        for (VitalSigns vitalSigns : vitalSignHistory.getVitalSignHistory()) {
//            System.out.println(vitalSigns.getRespiratoryRate());
//        }
        if (vsign.equalsIgnoreCase("Respiratoryrate")) {
            if (ageGroup == "NewBorn") {
                return (vitalSigns.getRespiratoryRate() >= 30 && vitalSigns.getRespiratoryRate() <= 50);

            } else if (ageGroup == "Infant") {
                return (vitalSigns.getRespiratoryRate() >= 20 && vitalSigns.getRespiratoryRate() <= 30);

            } else if (ageGroup == "Toddler") {
                return (vitalSigns.getRespiratoryRate() >= 20 && vitalSigns.getRespiratoryRate() <= 30);

            } else if (ageGroup == "PreSchooler") {
                return (vitalSigns.getRespiratoryRate() >= 20 && vitalSigns.getRespiratoryRate() <= 30);

            } else if (ageGroup == "School Age") {
                return (vitalSigns.getRespiratoryRate() >= 20 && vitalSigns.getRespiratoryRate() <= 30);

            } else if (ageGroup == "Adolscent") {
                return (vitalSigns.getRespiratoryRate() >= 12 && vitalSigns.getRespiratoryRate() <= 20);

            } else {
                System.out.println("Please enter a valid date of birth");
            }

        } else if (vsign.equalsIgnoreCase("HeartRate")) {
            if (ageGroup.equals("NewBorn")) {
                return (vitalSigns.getHeartRate() >= 120 && vitalSigns.getHeartRate() <= 160);

            } else if (ageGroup.equals("Infant")) {
                return (vitalSigns.getHeartRate() >= 80 && vitalSigns.getHeartRate() <= 140);

            } else if (ageGroup.equals("Toddler")) {
                return (vitalSigns.getHeartRate() >= 80 && vitalSigns.getHeartRate() <= 130);

            } else if (ageGroup.equals("PreSchooler")) {
                return (vitalSigns.getHeartRate() >= 80 && vitalSigns.getHeartRate() <= 120);

            } else if (ageGroup.equals("School Age")) {
                return (vitalSigns.getHeartRate() >= 70 && vitalSigns.getHeartRate() <= 110);

            } else if (ageGroup.equals("Adolscent")) {
                return (vitalSigns.getHeartRate() >= 55 && vitalSigns.getHeartRate() <= 105);

            } else {
                System.out.println("Please enter a valid date of birth");
            }
        } else if (vsign.equalsIgnoreCase("BloodPressure")) {
            if (ageGroup.equals("NewBorn")) {
                return (vitalSigns.getBloodPressure() >= 50 && vitalSigns.getBloodPressure() <= 70);

            } else if (ageGroup == "Infant") {
                return (vitalSigns.getBloodPressure() >= 70 && vitalSigns.getBloodPressure() <= 100);

            } else if (ageGroup == "Toddler") {
                return (vitalSigns.getBloodPressure() >= 80 && vitalSigns.getBloodPressure() <= 110);

            } else if (ageGroup == "PreSchooler") {
                return (vitalSigns.getBloodPressure() >= 80 && vitalSigns.getBloodPressure() <= 110);

            } else if (ageGroup == "School Age") {
                return (vitalSigns.getBloodPressure() >= 80 && vitalSigns.getBloodPressure() <= 120);

            } else if (ageGroup == "Adolscent") {
                return (vitalSigns.getBloodPressure() >= 110 && vitalSigns.getBloodPressure() <= 120);
            } else {
                System.out.println("Please enter a valid date of birth");
            }
        } else if (vsign.equalsIgnoreCase("Weight")) {
            if (ageGroup == "NewBorn") {
                return (vitalSigns.getWeight() >= 2 && vitalSigns.getWeight() <= 3);

            } else if (ageGroup == "Infant") {
                return (vitalSigns.getWeight() >= 4 && vitalSigns.getWeight() <= 10);

            } else if (ageGroup == "Toddler") {
                return (vitalSigns.getWeight() >= 10 && vitalSigns.getWeight() <= 14);

            } else if (ageGroup == "PreSchooler") {
                return (vitalSigns.getWeight() >= 14 && vitalSigns.getWeight() <= 18);

            } else if (ageGroup == "School Age") {
                return (vitalSigns.getWeight() >= 20 && vitalSigns.getWeight() <= 42);

            } else if (ageGroup == "Adolscent") {
                return (vitalSigns.getWeight() > 50);

            } else {
                System.out.println("Please enter a valid date of birth");
            }
        } else if (vsign.equalsIgnoreCase("WeightInPounds")) {
            if (ageGroup == "NewBorn") {
                return (vitalSigns.getWeightInPounds() >= 4.5 && vitalSigns.getWeightInPounds() <= 7);

            } else if (ageGroup == "Infant") {
                return (vitalSigns.getWeightInPounds() >= 9 && vitalSigns.getWeightInPounds() <= 22);

            } else if (ageGroup == "Toddler") {
                return (vitalSigns.getWeightInPounds() >= 22 && vitalSigns.getWeightInPounds() <= 31);

            } else if (ageGroup == "PreSchooler") {
                return (vitalSigns.getWeightInPounds() >= 31 && vitalSigns.getWeightInPounds() <= 40);

            } else if (ageGroup == "School Age") {
                return (vitalSigns.getWeightInPounds() >= 41 && vitalSigns.getWeightInPounds() <= 92);

            } else if (ageGroup == "Adolscent") {
                return (vitalSigns.getWeightInPounds() > 110);

            } else {
                System.out.println("Please enter a valid date of birth");
            }
        } else {
            System.out.println("Please enter a valid vital sign.");
        }

        return false;
    }

}
