package com.fmr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {
    @Test
    public void initialBalanceIsZero(){
        Account account = new Account(100);

        assertEquals(0.0,account.getBalance(),  0.0001);


    }

    @Test
    public void depositWithPositiveValue(){
        double depositAmt=100.0;
        Account account = new Account(100);
        account.deposit(depositAmt);


        assertEquals(depositAmt, account.getBalance(),  0.0001);
        System.out.println(account.getBalance());
        account.deposit(depositAmt);

        assertEquals(depositAmt, account.getBalance(), 0.001);
        System.out.println(account.getBalance());

    }

    @Test
    public void depositWithDrawPositive(){
        double initialBalanc = 1000.0;
        double withdrawAmt= 100.0;
        Account account = new Account(100);
        account.withDraw(withdrawAmt);
        assertEquals(initialBalanc - withdrawAmt, account.getBalance(), 0.0001);
        System.out.println(account.getBalance());

    }

    @Test
    public void SavingsWIthdrawWithFee(){
        double initialBalnc =1000;
        double withdrawAmt = 100;
        Account account = new Account(100.0);
        SavingsAccount saveacct = new SavingsAccount(100);







    }

    @Test (expected = IllegalArgumentException.class)
    public void cannotDepositNegitive(){

        Account account =new Account(100.00);
         account.deposit(-100.0);
    }



}
