/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class Person {
    private String firstName;
    private String lastName;
    private long phoneNo;
    private Date dateOfBirth;
//    private Date dateOfBirth = new Date();
    private int age;
    private float height;
    private int weight;
    private long ssn;
    
   private Address address;
   private SavingAccount savingAccountInfo;
   private CheckingAccount checkingAccountInfo;
   private DriverLicense drivingLicenseInfo;
   private MedicalRecord medicalRecordInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SavingAccount getSavingAccountInfo() {
        return savingAccountInfo;
    }

    public void setSavingAccountInfo(SavingAccount savingAccountInfo) {
        this.savingAccountInfo = savingAccountInfo;
    }

    public CheckingAccount getCheckingAccountInfo() {
        return checkingAccountInfo;
    }

    public void setCheckingAccountInfo(CheckingAccount checkingAccountInfo) {
        this.checkingAccountInfo = checkingAccountInfo;
    }

    public DriverLicense getDrivingLicenseInfo() {
        return drivingLicenseInfo;
    }

    public void setDrivingLicenseInfo(DriverLicense drivingLicenseInfo) {
        this.drivingLicenseInfo = drivingLicenseInfo;
    }

    public MedicalRecord getMedicalRecordInfo() {
        return medicalRecordInfo;
    }

    public void setMedicalRecordInfo(MedicalRecord medicalRecordInfo) {
        this.medicalRecordInfo = medicalRecordInfo;
    }
   
    
}
