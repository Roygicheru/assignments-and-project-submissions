package com.github.roygicheru.Exercises.JavaSE007;

/**
 * A class representing a bank account with basic operations.
 * @author Roy Gicheru
 */

public class BankAccount {

    // Instance variables for account number, account holder, and balance
    public String accountNumber;
    public String accountHolder;
    public Double balance;

    // Constructor to initialize a bank account
    public BankAccount(String accountNumber, String accountHolder, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Alternative constructors can be added as needed

//    public BankAccount_RoyGicheru(String accountNumber, String accountHolder) {
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//        this.balance = 0.0;
//    }
//
//    public BankAccount_RoyGicheru(String accountNumber) {
//        this.accountNumber = accountNumber;
//        this.accountHolder = null;
//        this.balance = 0.0;
//    }
//
//    public BankAccount_RoyGicheru() {
//        this.accountNumber = null;
//        this.accountHolder = null;
//        this.balance = 0.0;
//    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("The balance of user "+ this.accountHolder + " of account number " + this.accountNumber +" is " + this.balance);
    }
}