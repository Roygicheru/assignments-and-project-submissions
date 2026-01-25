package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz4;

public class SavingsAccount extends Bank {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) {
        double minimumBalance = 100;
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw " + amount + ". Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }
    
}