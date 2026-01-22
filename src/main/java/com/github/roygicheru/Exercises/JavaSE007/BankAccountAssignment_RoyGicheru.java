package com.github.roygicheru.Exercises.JavaSE007;

public class BankAccountAssignment_RoyGicheru {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("101000", "Roy Gicheru", 30000.0);
        bankAccount.deposit(20000);
        bankAccount.withdraw(10000);
        bankAccount.displayBalance();
    }
}
