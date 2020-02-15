/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    
    Date date;
    
    public Customer(String password, String userName) {
        super(password, userName, "Customer");
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }
    
    @Override
    public int compareTo(Customer c) {
       return c.getUserName().compareTo(this.getUserName());
    }
    
    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    
   
}
