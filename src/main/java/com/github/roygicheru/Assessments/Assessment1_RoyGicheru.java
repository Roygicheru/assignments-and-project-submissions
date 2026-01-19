package com.github.roygicheru.Assessments;

import com.github.roygicheru.App;
import java.util.Scanner;

/*
    * Assessment 1 containing 5 quizzes as methods.
    @author Roy Gicheru
*/

public class Assessment1_RoyGicheru {

    public static void runAssessmentMenu() { // Static method to run all the assessments one at a time
    boolean backToMain = false;
    while (!backToMain) {
        System.out.println("\n--- Assessment 1 Quizzes ---");
        System.out.println("1. Quiz One");
        System.out.println("2. Quiz Two");
        System.out.println("3. Quiz Three");
        System.out.println("4. Quiz Four");
        System.out.println("5. Quiz Five");
        System.out.println("6. Back to Main Menu");
        System.out.print("\nSelected choice: ");

        String choice = App.input.nextLine(); // Using your shared scanner

        switch (choice) { // Switch statement meant to call each quiz method
            case "1": quizOne(); break;
            case "2": quizTwo(); break;
            case "3": quizThree(); break;
            case "4": quizFour(); break;
            case "5": quizFive(); break;
            case "6": System.out.println("\nExiting to main menu...");backToMain = true; break;
            default: System.out.println("Invalid choice.");
        }
    }
}

    public static void quizOne(){ // Method for quiz one
        Scanner scannerOne = App.input;
        System.out.println("\nEnter three numbers for calculations: ");
        while (!scannerOne.hasNextInt()) { // Loop to stop user from inputting undesired values
            System.out.println("Invalid input. Please enter a valid number.");
            scannerOne.next(); // Clear the invalid input
            System.out.println("\nEnter three numbers for calculations: "); //Prompt user again
        }
        int a = scannerOne.nextInt();
        int b = scannerOne.nextInt();
        int c = scannerOne.nextInt();
        scannerOne.nextLine(); // Clear the newline character

        System.out.println("\nYou entered: "+ a + ", " + b + ", " + c);
        System.out.println("\nThe sum is: " + (a + b + c));
        System.out.println("The product is: " + (a * b * c));
        System.out.println("The result of (a + b) * c is: " + ((a + b)*c));
        System.out.println("The remainder when a is divided by b is: " + (a % b));
    }
    
    public static void quizTwo(){ // Quiz two method
        Scanner scannerTwo = App.input;

        while (true) {
        System.out.print("\nEnter student score or 0 to exit: ");
        while (!scannerTwo.hasNextInt()) { // Loop to stop user from inputting undesired values
            System.out.println("Invalid input. Please enter a valid number.");
            scannerTwo.next(); // Clear the invalid input
            System.out.print("\nEnter student score or 0 to exit: "); //Prompt user again
        }
        int score = scannerTwo.nextInt();
        scannerTwo.nextLine(); // Clear the newline character

        if(score < 0 || score > 100){ // Validate score range
            System.out.println("Invalid score");
            continue;
        } else{ // Valid score, determine grade
            if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score < 90){
                System.out.println("Grade: B");
            } else if (score >= 70 && score < 80){
                System.out.println("Grade: C");
            } else if (score >= 60 && score < 70){
                System.out.println("Grade: D");
            } else if (score == 0){
                System.out.println("Exiting quiz two, goodbye!");
                return; // Exit condition
            }
            else {
                System.out.println("Grade: F");
            }
            }
        }
    }

    public static void quizThree(){ // Quiz three method
        for(int i = 1; i <= 20; i++){ //Loop through numbers 1 to 20
            if (i % 2 == 0) { // check if even
                if (i % 5 == 0){ // check if divisible by 5
                    System.out.println(i + " - Even, Multiple of 5");
                } else{
                    System.out.println(i + " - Even");
                }
            } else if (i % 2 != 0){ // check if odd
                if (i % 5 == 0){ // check if divisible by 5
                    System.out.println(i + " - Odd, Multiple of 5");
                } else{
                    System.out.println(i + " - Odd");
                }
            }
        }
    }

    public static void quizFour(){ // Quiz four method
        Scanner scannerThree = App.input;
        while (true){
            System.out.print("\nEnter a positive integer, or 0 to exit: ");
            while (!scannerThree.hasNextInt()) { // Loop to stop user from inputting undesired values
                System.out.println("Invalid input. Please enter a valid number.");
                scannerThree.next(); // Clear the invalid input
                System.out.print("\nEnter a positive integer, or 0 to exit: "); //Prompt user again
            }
            int number = scannerThree.nextInt();
            scannerThree.nextLine(); // Clear the newline character

            if (number == 0) {
                System.out.println("\nExiting quiz four, goodbye!");
                return;
            } else if (number < 0 || number > 12){ // Validate input range, limit to 12 to prevent overflow
                System.out.println("Please enter positive integers only (0-12).");
                continue;
            } else {
                int result = 1;
                for (int i = 1; i <= number; i++){ // Calculate factorial
                    result *= i;
                }
                System.out.println("Factorial of "+ number + " is: " + result);
                continue;
            }
        }
    }

    public static void quizFive(){ // Quiz five method
        System.out.println("\nPrinting a right angled triangle consisting of stars:");
        for(int i = 0; i < 5; i++){ //Outer loop for rows
            for(int j = 0; j <= i; j++){ //Inner loop for columns
                System.out.print("*"); // Print star
            }
            System.out.println(""); // Move to next line after each row
        }
    }
}
