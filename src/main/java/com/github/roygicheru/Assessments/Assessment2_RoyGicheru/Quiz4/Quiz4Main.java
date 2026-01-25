package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz4;

/* This is a project meant to demonstrate inheritance
    * with a Bank account system consisting of a base Bank class
    * and two derived classes: CheckingAccount and SavingsAccount.
    *@author Roy Gicheru
 */
public class Quiz4Main {
    public static void main(String[] args){
        Bank bankAccount = new Bank("a1b2c3", "Roy Gicheru", 2000.0);
        CheckingAccount checkingAccount = new CheckingAccount("a1b2c3", "Roy Gicheru", 2000.0, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount("a1b2c3", "Roy Gicheru", 2000.0, 5.0);

        System.out.println("\nBank Account Details:");
        bankAccount.deposit(300.0);
        bankAccount.withdraw(100.0);
        bankAccount.getBalance();

        System.out.println("\nChecking Account Details:");
        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(200.0);
        checkingAccount.getLatestBalance();

        System.out.println("\nSavings Account Details:");
        savingsAccount.deposit(400.0);
        savingsAccount.withdraw(100.0);
        savingsAccount.getLatestBalance();
    }
    
}
