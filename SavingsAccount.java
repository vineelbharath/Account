package com.fmr;

public class SavingsAccount extends Account {

    public SavingsAccount(double initialBalance){
        super(initialBalance);
    }
        @Override
        public void withDraw(double amount){
            double initialBalance = 1000.0;
             double fee = 1.0;
            double cummfee = amount + fee;
            double balance = super.getBalance();
            super.setBalance(balance - cummfee);

            System.out.println("Final balance :" +super.getBalance());



        }




}
