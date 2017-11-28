package com.company;

/**
 * Created by jitendra on 26/11/17.
 */
public class BankDriver {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.depositFund(1000);
        System.out.println("Money in account is : "+account.getBalance());
        account.withdrawMoney(534);
    }
}
