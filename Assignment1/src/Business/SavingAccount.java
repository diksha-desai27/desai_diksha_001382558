/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author DELL
 */
public class SavingAccount {
    
    private String bankName;
    private int bankRoutingNumber;
    private int bankAccountNumber;
    private float accountBalance;
    public static final String accountType = "Savings";

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(int bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    
}
