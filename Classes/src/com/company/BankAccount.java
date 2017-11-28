package com.company;

/**
 * Created by jitendra on 26/11/17.
 */
public class BankAccount {

    private String accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(float money){
        this.balance = this.balance + money;
    }

    public void withdrawMoney(float money){

        if (money > this.balance){
            System.out.println("Insufficient Balance");
        } else {
            this.balance = this.balance - money;
            System.out.println("Withdrawn of "+money+" processed. Remaining balance is "+this.balance);
        }
    }
}
