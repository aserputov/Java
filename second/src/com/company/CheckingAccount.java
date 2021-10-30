package com.company;

public class CheckingAccount extends Account {
    private static double fee;
    public CheckingAccount(double fe, double curr) {
        super(curr);
        if( fe < 0 ) {
            System.err.println();// Set the initial value for the class attribute x
        }else{
            fee = fe;
        }
    }

    public void subtractFee() {
        setCurr(getCurr() - fee);
    }
    @Override
    public boolean Debit(double take) {
        boolean check = super.Debit(take);
        if(!check){
            check = false;
        }else{
            subtractFee();
            check = true;
        }
        return check;
    }

    @Override
    public boolean Credit(double add) {
        boolean check = super.Credit(add);
        if(!check){
            check = false;
        }else{
            subtractFee();
            check = true;
        }
        return check;
    }
}
