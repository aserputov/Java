/**********************************************
 Workshop 2
 Course:<subject type> - Semester
 Last Name: Serputov
 First Name: Anatoliy
 ID: 167389188
 Section: NFF
 This assignment represents my own work in accordance with Seneca Academic Policy. Signature
 Date: 2/7/2021
 **********************************************/
package com.company;

public class Main {

    public static void main(String[] args) {
        Account a = new Account(100);
        a.Debit(98);
        SavingsAccount s = new SavingsAccount(0.1,7);
        s.CalculateInterest();
        CheckingAccount c = new CheckingAccount(40,100);
        c.Debit(20);
        System.out.println(c.getCurr());

    }
}
