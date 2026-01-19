package com.github.roygicheru.CalculatorAssignment;

import java.util.Scanner;

/*
    * A simple calculator that adds two numbers provided by the user.
    @author Roy Gicheru
 */
public class SimpleCalculator_RoyGicheru {
    public void mainTask() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        while (true) { //Loop to enable user to have multiple tries
            
            System.out.print("Enter first number or 0 to exit: "); //Prompt user for first number
            /*  Loop to scan if user has entered any other value than the desired one (double),
            and helpfully inform and let them try again*/
            while (!scanner.hasNextDouble()) { // Loop to stop user from inputting undesired values
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                System.out.print("Enter first number or 0 to exit: "); //Prompt user again
            }
            double num1 = scanner.nextDouble();//Read user input
            if (num1 == 0) { //Exit condition
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            
            System.out.print("Enter second number or 0 to exit: ");//Replicated code for second input
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                System.out.print("Enter second number or 0 to exit: ");
            }
            double num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.println("\nYou have entered " + num1 + " and " + num2);

            boolean exitInnerLoop = false; // Flag to control inner loop exit
            
            while (true) {
                System.out.println("\nEnter operation to perform");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Enter new numbers");

                System.out.print("Select an operation (1-5): ");
                String operation = scanner.next(); //Read user input for operation

                /* Switch statement to handle different operations 
                moved operation calculation to output for efficiency */
                switch (operation) {
                    case "1":
                        System.out.println("\nThe sum is: " + (num1 + num2));
                        break;
                    case "2":
                        if (num1 < 0 || num2 < 0) { // Check for negative numbers
                            System.out.println("Error: No negative numbers allowed!");
                        } 
                        else if (num2 > num1) { // Check if first number is larger
                            System.out.println("Error: The first number must be larger than the second!");
                        } 
                        else {
                            // This only runs if BOTH conditions above were false
                            System.out.println("\nThe difference is: " + (num1 - num2));
                        }
                        break;
                    case "3":
                        System.out.println("\nThe product is: " + (num1 * num2));
                        break;
                    case "4":
                        if (num2 != 0) {
                            System.out.println("\nThe quotient is: " + (num1 / num2));
                        } else {
                            System.out.println("\nError: Division by zero is not allowed.");
                        }
                        break;
                    case "5":
                        System.out.println("\nReverting to number input..."); //
                        exitInnerLoop = true; // Set flag to exit inner loop
                        break;
                    default:
                        System.out.println("\nInvalid operation selected.");
                }
                if (exitInnerLoop) {
                    break; // Exit inner loop to enter new numbers
                }
            }
        }
        scanner.close(); //Close the scanner to prevent resource leak
    }
}
