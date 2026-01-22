package com.github.roygicheru.Assessments.Assessment1;

import java.util.Scanner;

/*
    * Assessment 1 containing 5 quizzes as methods.
    @author Roy Gicheru
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
        // 2. CHANGED: App.input -> input
        Scanner scannerOne = input; 
        System.out.println("\nEnter three numbers for calculations: ");
        while (!scannerOne.hasNextInt()) { 
            System.out.println("Invalid input. Please enter a valid number.");
            scannerOne.next(); 
            System.out.println("\nEnter three numbers for calculations: "); 
        }
        int a = scannerOne.nextInt();
        int b = scannerOne.nextInt();
        int c = scannerOne.nextInt();
        scannerOne.nextLine(); 

        System.out.println("\nYou entered: "+ a + ", " + b + ", " + c);
        System.out.println("\nThe sum is: " + (a + b + c));
        System.out.println("The product is: " + (a * b * c));
        System.out.println("The result of (a + b) * c is: " + ((a + b)*c));
        System.out.println("The remainder when a is divided by b is: " + (a % b));
    }
    
    public static void quizTwo(){ 
        // 2. CHANGED: App.input -> input
        Scanner scannerTwo = input;

        while (true) {
        System.out.print("\nEnter student score or 0 to exit: ");
        while (!scannerTwo.hasNextInt()) { 
            System.out.println("Invalid input. Please enter a valid number.");
            scannerTwo.next(); 
            System.out.print("\nEnter student score or 0 to exit: "); 
        }
        int score = scannerTwo.nextInt();
        scannerTwo.nextLine(); 

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
                return; 
            }
            else {
                System.out.println("Grade: F");
            }
            }
        }
    }

    public static void quizThree(){ 
        for(int i = 1; i <= 20; i++){ 
            if (i % 2 == 0) { 
                if (i % 5 == 0){ 
                    System.out.println(i + " - Even, Multiple of 5");
                } else{
                    System.out.println(i + " - Even");
                }
            } else if (i % 2 != 0){ 
                if (i % 5 == 0){ 
                    System.out.println(i + " - Odd, Multiple of 5");
                } else{
                    System.out.println(i + " - Odd");
                }
            }
        }
    }

    public static void quizFour(){ 
        // 2. CHANGED: App.input -> input
        Scanner scannerThree = input;
        while (true){
            System.out.print("\nEnter a positive integer, or 0 to exit: ");
            while (!scannerThree.hasNextInt()) { 
                System.out.println("Invalid input. Please enter a valid number.");
                scannerThree.next(); 
                System.out.print("\nEnter a positive integer, or 0 to exit: "); 
            }
            int number = scannerThree.nextInt();
            scannerThree.nextLine(); 

            if (number == 0) {
                System.out.println("\nExiting quiz four, goodbye!");
                return;
            } else if (number < 0 || number > 12){ 
                System.out.println("Please enter positive integers only (0-12).");
                continue;
            } else {
                int result = 1;
                for (int i = 1; i <= number; i++){ 
                    result *= i;
                }
                System.out.println("Factorial of "+ number + " is: " + result);
                continue;
            }
        }
    }

    public static void quizFive(){ 
        System.out.println("\nPrinting a right angled triangle consisting of stars:");
        for(int i = 0; i < 5; i++){ 
            for(int j = 0; j <= i; j++){ 
                System.out.print("*"); 
            }
            System.out.println(""); 
        }
    }
}