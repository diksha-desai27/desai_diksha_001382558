/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author dikshadesai
 */
public class VitalSigns {
    private float respiratoryRate;
    private float heartRate;
    private float bloodPressure;
    private float weight;
    private float weightInPounds;
    private Date dateTime;
    private VitalSignHistory vsh = new VitalSignHistory();
    
    VitalSigns(float rr, float hr, float bp, float w, float wp)
    {
        this.respiratoryRate = rr;
        this.heartRate = hr;
        this.bloodPressure = bp;
        this.weight = w;
        this.weightInPounds = wp;
    }
    
    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
   
}
