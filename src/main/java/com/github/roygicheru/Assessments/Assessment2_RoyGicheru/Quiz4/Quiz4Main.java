package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz4;

public class Quiz4Main {
    public static void main(String[] args){
        Bank bankAccount = new Bank("a1b2c3", "Roy Gicheru", 2000.0);
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.getLatestBalance();
    }
    
}
