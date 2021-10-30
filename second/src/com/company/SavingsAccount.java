package com.company;

public class SavingsAccount extends Account {
    private static double rate;

    public SavingsAccount(double ratt, double curr) {
        super(curr);
        if( ratt < 0 ) {
            System.err.println();// Set the initial value for the class attribute x
        }else{
            rate = ratt;
        }
    }
    public double CalculateInterest() {
        rate = getCurr()* rate ;

        return rate;
    }


}
