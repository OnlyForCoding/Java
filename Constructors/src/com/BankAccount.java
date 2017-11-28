package com;

/**
 * Created by jitendra on 26/11/17.
 */
public class BankAccount {

    private String accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructor
    public BankAccount(){
        this("1234",2,"default customer","default email","default phone");
        System.out.println("Empty constructor is called");
    }

    //Another constructor
    public BankAccount(String accountNumber,float balance,String customerName,
                       String email,String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",4500,customerName,email,phoneNumber);
        //this.customerName = customerName;
        //this.email = email;
        //this.phoneNumber = phoneNumber;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
