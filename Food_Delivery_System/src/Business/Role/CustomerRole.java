/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Restaurant restaurant, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer, account);
    }
    
    
}
