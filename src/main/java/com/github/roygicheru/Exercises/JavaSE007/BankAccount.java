package com.github.roygicheru.Exercises.JavaSE007;

/**
 * A class representing a bank account with basic operations.
 * @author Roy Gicheru
 */

public class BankAccount {

    // Instance variables for account number, account holder, and balance
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    // Constructor to initialize a bank account
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
            System.out.println("\nAccount created for " + accountHolder + " of account number " + accountNumber + " with initial balance: " + initialBalance);
        } else {
            this.balance = 0.0;
            System.out.println("Initial balance cannot be negative, setting it to 0.0");
        }
    }

    // Alternative constructors for more flexibility

   public BankAccount(String accountNumber, String accountHolder) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = 0.0;
   }

   public BankAccount(String accountNumber) {
       this.accountNumber = accountNumber;
       this.accountHolder = null;
       this.balance = 0.0;
   }

   public BankAccount() {
       this.accountNumber = null;
       this.accountHolder = null;
       this.balance = 0.0;
   }

    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("\nDeposited: " + depositAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if (this.balance >= withdrawAmount) {
                this.balance -= withdrawAmount;
                System.out.println("Withdrew: " + withdrawAmount);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("\nThe balance of user "+ this.accountHolder + " of account number " + this.accountNumber +" is " + this.balance + "\n");
    }
}