/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class VitalSignHistory {
    
    private List<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    public VitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public List<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public void addVitalSigns(VitalSigns v)
    {
        vitalSignHistory.add(v);
    }

}
