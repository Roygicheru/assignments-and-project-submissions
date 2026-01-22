package com.github.roygicheru.Exercises.JavaSE007;

public class BankAccount {

    public String accountNumber;
    public String accountHolder;
    public Double balance;

    public BankAccount(String accountNumber, String accountHolder, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

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

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

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

    public void displayBalance() {
        System.out.println("The balance of user "+ this.accountHolder + " of account number " + this.accountNumber +" is " + this.balance);
    }
}