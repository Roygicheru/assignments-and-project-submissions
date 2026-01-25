package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz4;

public class CheckingAccount extends Bank {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        //allow overdraft up to 500
        double overdraftLimit = -500;
        if (getBalance() - amount >= overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw " + amount + ". Overdraft limit of " + overdraftLimit + " exceeded.");
        }
    }
}