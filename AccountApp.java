package com.fmr;

public class AccountApp {
    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount(1000.0);
        System.out.println("balance is " + savingsAccount.getBalance());
        savingsAccount.withDraw(100.00);
        Account checkingaccount = new Account(1100.0);
        checkingaccount.getcheckBal();

    }
    }
