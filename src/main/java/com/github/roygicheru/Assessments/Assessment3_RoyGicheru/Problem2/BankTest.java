package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem2;

/* This is a project meant to demonstrate:
 * Exception Handling by creating custom exceptions like InsufficientFundsException,
 * InvalidTransactionException, and AccountNotFoundException.
 *@author Roy Gicheru
 */

public class BankTest {
    public static void main(String[] args) {
        System.out.println("--- STARTING BANK APP ---");

        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);
            account2.deposit(500);
            account2.withdraw(200);
            account2.transfer("ACC001", 100);
            account1.deposit(-100); // Should throw InvalidTransactionException
            account1.withdraw(2000); // Should throw InsufficientFundsException
            account1.transfer("INVALID", 100); // Should throw AccountNotFoundException
        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}
