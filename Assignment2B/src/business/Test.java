/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dikshadesai
 */
public class Test {
    
    private VitalSigns vs;
    public static void main(String args[])
    {
        List<Patient> patients = new ArrayList<Patient>();
        Patient p = new Patient();

        String c = " ";
        Scanner in = new Scanner(System.in);
        Test t = new Test();
        do 
        {
            p = new Patient();
            System.out.println("Enter your name:");
            String name = in.nextLine();
            p.setName(name);
            System.out.println("Enter your Respiratory rate:");
            float rr = in.nextFloat();
            System.out.println("Enter your Heart rate:");
            float hr = in.nextFloat();
            System.out.println("Enter your Blood Pressure:");
            float bp = in.nextFloat();
            System.out.println("Enter your weight in kgs:");
            float w = in.nextFloat();
            System.out.println("Enter your weight in pounds:");
            float wp = in.nextFloat();
            t.vs = new VitalSigns(rr,hr,bp,w,wp);
            p.setVitalSigns(t.vs);
            p.newVitalSign(rr, hr, bp, w, wp);
            patients.add(p);
            in.nextLine();
            System.out.println("Do you want to continue? Y/N");
            c = in.nextLine();
        }
        while(c.equalsIgnoreCase("Y"));
        
        
        p.displayDetails(patients);
        
        System.out.println("\n\nEnter name of the patient whose history you want to search:");
        String patientName = in.nextLine(); 
        System.out.println("Enter your date of birth(MM/dd/yyyyy):");
        String dateOfBirth = in.nextLine();
        p.setDateOfBirth(dateOfBirth);
        Patient searchPatient = Test.findPatient(patients, patientName);
        //System.out.println(searchPatient);
        System.out.println("Enter the vital signs you want to check:");
        String vsign = in.nextLine();
        boolean result = searchPatient.isThisVitalSignNormal(vsign);
        if(result)
        {
            System.out.println("Patient is Normal");
        }
        else
        {
            System.out.println("Patient is Abnormal");
        }
    }
    
    public static Patient findPatient(List<Patient> patients,String name)
    {
       List<Patient> sortedList = new ArrayList<>();
        for(Patient p: patients){
            if(p.getName().equalsIgnoreCase(name)){
                sortedList.add(p);
            }
        }
        if(sortedList.size()!=0){
            return sortedList.get(sortedList.size()-1);
        }
        return null;
    }
    
}
