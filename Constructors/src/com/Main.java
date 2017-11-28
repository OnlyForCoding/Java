package com;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount account = new BankAccount();//BankAccount("123456789",5000,"James Pics","jitu@gmail.com","(+91)8928812342");
        System.out.println("Balance = "+account.getBalance());
        System.out.println("Account number = "+account.getAccountNumber());
        System.out.println("Customer name = "+account.getCustomerName());
        System.out.println("Email Address = "+account.getEmail());
        System.out.println("phone number = "+account.getPhoneNumber());
        account.depositFund(1000);
        System.out.println("Money in account is : "+account.getBalance());
        account.withdrawMoney(534);

        System.out.println("************************************************************************************************ ");
        BankAccount account1 = new BankAccount("Shubham","james@gmail.com","+(231) 55512345");
        System.out.println("Balance1 = "+account1.getBalance());
        System.out.println("Account number1 = "+account1.getAccountNumber());
        System.out.println("Customer name1 = "+account1.getCustomerName());
        System.out.println("Email Address1 = "+account1.getEmail());
        System.out.println("phone number1 = "+account1.getPhoneNumber());
    }
}
