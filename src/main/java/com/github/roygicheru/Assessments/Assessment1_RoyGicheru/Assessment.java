package com.github.roygicheru.Assessments.Assessment1_RoyGicheru;

import java.util.Scanner;

/*
    * Assessment 1 containing 5 quizzes as methods.
    * @author Roy Gicheru
*/

public class Assessment {

    public static final Scanner input = new Scanner(System.in); // Global scanner for all methods

    public static void runAssessmentMenu() { 
        Scanner menuScanner = input; // Use the global scanner
        boolean backToMain = false; // Control variable for the menu loop
        
        // Main menu loop
        while (!backToMain) {
            System.out.println("\n--- Assessment 1 Quizzes ---");
            System.out.println("1. Quiz One");
            System.out.println("2. Quiz Two");
            System.out.println("3. Quiz Three");
            System.out.println("4. Quiz Four");
            System.out.println("5. Quiz Five");
            System.out.println("6. Exit");
            System.out.print("\nSelected choice: ");

            String choice = menuScanner.nextLine(); 

            switch (choice) { 
                case "1": quizOne(); break;
                case "2": quizTwo(); break;
                case "3": quizThree(); break;
                case "4": quizFour(); break;
                case "5": quizFive(); break;
                case "6": 
                    System.out.println("\nExiting...");
                    menuScanner.close();
                    input.close(); // Close the global scanner too
                    System.exit(0); 
                    break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    public static void quizOne(){ 
        
        Scanner scannerOne = input; // Used the global scanner
        System.out.println("\nEnter three numbers for calculations: "); // Prompt for input
        while (!scannerOne.hasNextInt()) { 
            System.out.println("Invalid input. Please enter a valid number."); // Input validation
            scannerOne.next(); 
            System.out.println("\nEnter three numbers for calculations: "); // Prompt again
        }

        // Read three integers
        int a = scannerOne.nextInt();
        int b = scannerOne.nextInt();
        int c = scannerOne.nextInt();
        scannerOne.nextLine(); // Clear the buffer

        // Display results
        System.out.println("\nYou entered: "+ a + ", " + b + ", " + c);
        System.out.println("\nThe sum is: " + (a + b + c));
        System.out.println("The product is: " + (a * b * c));
        System.out.println("The result of (a + b) * c is: " + ((a + b)*c));
        System.out.println("The remainder when a is divided by b is: " + (a % b));
    }
    
    public static void quizTwo(){ 
        Scanner scannerTwo = input; // Used the global scanner

        // Loop for continuous input
        while (true) {
        System.out.print("\nEnter student score or 0 to exit: ");

        // Input validation, only integers
        while (!scannerTwo.hasNextInt()) { 
            System.out.println("Invalid input. Please enter a valid number.");
            scannerTwo.next(); 
            System.out.print("\nEnter student score or 0 to exit: "); 
        }
        int score = scannerTwo.nextInt(); // Read score
        scannerTwo.nextLine(); // Clear buffer

        // Grade determination
        if(score < 0 || score > 100){ 
            System.out.println("Invalid score");
            continue;
        } else{ 
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
                return; // Exit the method
            }
            else {
                System.out.println("Grade: F");
            }
            }
        }
    }

    public static void quizThree(){ 
        for(int i = 1; i <= 20; i++){  // Loop from 1 to 20
            if (i % 2 == 0) { // Check for even numbers and multiples of 5
                if (i % 5 == 0){ 
                    System.out.println(i + " - Even, Multiple of 5");
                } else{
                    System.out.println(i + " - Even");
                }
            } else if (i % 2 != 0){ // Check for odd numbers and multiples of 5
                if (i % 5 == 0){ 
                    System.out.println(i + " - Odd, Multiple of 5");
                } else{
                    System.out.println(i + " - Odd");
                }
            }
        }
    }

    public static void quizFour(){ 

        Scanner scannerThree = input; // Used the global scanner

        while (true){ // Loop for continuous input
            System.out.print("\nEnter a positive integer, or 0 to exit: ");

            while (!scannerThree.hasNextInt()) { // Input validation only integers
                System.out.println("Invalid input. Please enter a valid number.");
                scannerThree.next(); 
                System.out.print("\nEnter a positive integer, or 0 to exit: "); 
            }
            int number = scannerThree.nextInt(); // Read the integer
            scannerThree.nextLine(); // Clear buffer

            if (number == 0) { // Exit condition
                System.out.println("\nExiting quiz four, goodbye!");
                return; // Exit the method
            } else if (number < 0 || number > 12){ // Validate positive integers within range
                System.out.println("Please enter positive integers only (0-12).");
                continue; // Continue loop
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

    public static void quizFive(){ 
        System.out.println("\nPrinting a right angled triangle consisting of stars:");
        for(int i = 0; i < 5; i++){ // Outer loop for rows
            for(int j = 0; j <= i; j++){ // Inner loop for columns
                System.out.print("*"); // Print star
            }
            System.out.println(""); // New line after each row
        }
    }
}