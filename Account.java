package com.fmr;

public class Account {


        private double balance = 0.0;
        private  double collectedFees;


        public  Account( double initialBalance){
            this.balance = initialBalance;

        }


        public void deposit ( double amount){
            if (amount <0.0){
                throw new IllegalArgumentException("no negitive amount");
            }
            this.balance += amount;

        }
        public void withDraw( double amount){

            balance -= amount;
        }
        public double getBalance () {
            return balance;
        }

        public void setBalance(double amount){
            this.balance = amount;
        }

        public void collectFees(double feeAmount){

            this.collectedFees+=feeAmount;
        }

        public double getCollectedFees(){
            return this.collectedFees;
        }
        public void getcheckBal(){
            System.out.println("i am just account class");
        }
    }

