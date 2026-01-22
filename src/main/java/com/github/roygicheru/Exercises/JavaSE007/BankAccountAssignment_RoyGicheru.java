package com.github.roygicheru.Exercises.JavaSE007;

public class BankAccountAssignment_RoyGicheru {
    public static void main(String[] args) { // Test the BankAccount class
        // Create a bank account with initial user and account details
        BankAccount bankAccount = new BankAccount("101000", "Roy Gicheru", 30000.0);
        bankAccount.deposit(20000); // Deposit money
        bankAccount.withdraw(10000); // Withdraw money
        bankAccount.displayBalance(); // Display the current balance
    }
}
