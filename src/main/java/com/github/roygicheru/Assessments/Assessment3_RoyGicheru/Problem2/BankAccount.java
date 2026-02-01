package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem2;

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
    public void deposit(double depositAmount) throws InvalidTransactionException {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("\nDeposited: " + depositAmount);
        } else {
            throw new InvalidTransactionException("Deposit amount must be positive; cannot deposit: " + depositAmount);
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double withdrawAmount) throws InsufficientFundsException, InvalidTransactionException {
        if (withdrawAmount > 0) {
            if (this.balance >= withdrawAmount) {
                this.balance -= withdrawAmount;
                System.out.println("Withdrew: " + withdrawAmount);
            } else {
                throw new InsufficientFundsException("Insufficient funds for withdrawal of: "+ withdrawAmount);
            }
        } else {
            throw new InvalidTransactionException("Invalid withdrawal amount: " + withdrawAmount + ", amount must be greater than zero");
        }
    }

    // Method to get account number
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // Method to get account holder name
    public String getAccountHolder() {
        return this.accountHolder;
    }

    // Method to get current balance
    public double getBalance() {
        return this.balance;
    }

    // Method to transfer money to another account
    public void transfer(String targetAccountNumber, double transferAmount) throws AccountNotFoundException, InsufficientFundsException, InvalidTransactionException {
        if (targetAccountNumber == null || targetAccountNumber.isEmpty() || targetAccountNumber.equals("INVALID")) {
            throw new AccountNotFoundException("Target account is invalid.");
        } else if (transferAmount <= 0) {
            throw new InvalidTransactionException("Invalid transfer amount: " + transferAmount + ", amount must be greater than zero");
        } else if (this.balance < transferAmount) {
            throw new InsufficientFundsException("Insufficient funds for transfer of amount: " + transferAmount + " to account number: " + targetAccountNumber);
        }
        this.balance -= transferAmount;
        System.out.println("Transferred: " + transferAmount + " to account number: " + targetAccountNumber);
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("\nThe balance of user "+ this.accountHolder + " of account number " + this.accountNumber +" is " + this.balance + "\n");
    }
}
