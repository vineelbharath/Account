package com.fmr;

public class CheckingAccount extends Account {
    public CheckingAccount(double initialBalance){
        super(initialBalance);

    }

    @Override
    public void getcheckBal() {


        //Account account = new Account(1000.0);
        System.out.println("balance is " + super.getBalance());
    }
}