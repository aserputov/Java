package com.company;
import java.util.Scanner;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account[] acc = new Account[2];
        CheckingAccount checkingAccount = new CheckingAccount(0, 4);
        SavingsAccount savingsAccount = new SavingsAccount(0, 4);
        String choice = " ";
        acc[0] = savingsAccount;
        acc[1] = checkingAccount;

        for (int i = 0; i < 2; i++) {
            System.out.print("Please Enter Option 1 for Saving account or 2 for Checking account: ");
            choice = in.next();
            if (choice.equals("2")) {
                while (!choice.equals("0")) {
                System.out.println("Your Balance For Checking Account = : " + acc[i].getCurr());
                System.out.println("Please Enter Option 1 to Withdraw or 2 to Deposit and 0 to Exit ");
                choice = in.next();

                    switch (choice) {
                        case "0":
                            System.out.println("Thank you! Bye.");
                            break;
                        case "1":
                            System.out.println("Your Balance = :" + acc[i].getCurr());
                            System.out.print("Enter the amount to withdraw: ");
                            double amountW = in.nextDouble();
                            acc[i].Debit(amountW);
                            System.out.println("Your Balance = : " + acc[i].getCurr());
                            System.out.println();
                            choice = "0";
                            break;
                        case "2":
                            SavingsAccount account = new SavingsAccount(1.0, 4.0);
                            System.out.print("Enter the amount to deposit: ");
                            double amount = in.nextDouble();
                            account.Credit(amount);
                            System.out.println("Your Balance = : " + acc[i].getCurr());
                            double interest = account.CalculateInterest();
                            System.out.println("Interest: " + interest);
                            account.Credit(interest);
                            acc[i] = account;
                            System.out.println("Your Balance: " + acc[i].getCurr());
                            System.out.println();
                            choice = "0";
                            break;
                        default:
                            System.out.println("Thank you! Bye.");
                    };
                }
            } else {
                while (!choice.equals("0")) {
                System.out.println("Your Balance For Savings Account  = : " + acc[i].getCurr());
                System.out.println("Please Enter Option 1 to Withdraw or 2 to Deposit and 0 to Exit ");
                choice = in.next();

                    switch (choice) {
                        case "0":
                            System.out.println("Thank you! Bye.");
                            break;
                        case "1":
                            System.out.println("Your Balance = :" + acc[i].getCurr());
                            System.out.print("Enter the amount to withdraw: ");
                            double amountW = in.nextDouble();
                            acc[i].Debit(amountW);
                            System.out.println("Your Balance = : " + acc[i].getCurr());
                            System.out.println();
                            choice = "0";
                            break;
                        case "2":
                            SavingsAccount account = new SavingsAccount(1.0, 4.0);
                            System.out.print("Enter the amount to deposit: ");
                            double amountD = in.nextDouble();
                            account.Credit(amountD);
                            System.out.println("Your Balance = : " + acc[i].getCurr());
                            double interest = account.CalculateInterest();
                            System.out.println("Interest: " + interest);
                            account.Credit(interest);
                            acc[i] = account;
                            System.out.println("Your Balance: " + acc[i].getCurr());
                            System.out.println();
                            choice = "0";
                            break;
                        default:
                            System.out.println("Thank you! Bye.");

                    }
                    ;
                }

            }
        }

    }
}

