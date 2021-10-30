package com.company;

public class Account {

        private static double x;


        public Account(double cur) {
            if( cur < 0 ) {
                System.err.println();// Set the initial value for the class attribute x
            }else{
                x = cur;
            }
        }

        public boolean Debit(double take) {
            if(x  > take){
                x = x - take;
                System.out.println(x);
            }else{
                System.out.println("Debit amount exceeded account balance.");
            }
            return true;
        }
        public boolean Credit(double add) {
            x = x + add;

            return true;
        }
        public double getCurr() {

            return x;
        }
        public double setCurr(double sum) {
             return this.x = sum ;
        }
}
