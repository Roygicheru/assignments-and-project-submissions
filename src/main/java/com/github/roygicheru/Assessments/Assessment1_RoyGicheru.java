package com.github.roygicheru.Assessments;

import com.github.roygicheru.App;
import java.util.Scanner;

public class Assessment1_RoyGicheru {

    public static void runAssessmentMenu() {
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

        switch (choice) {
            case "1": quizOne(4, 5, 6); break;
            case "2": quizTwo(); break;
            case "3": quizThree(); break;
            case "4": quizFour(); break;
            case "5": quizFive(); break;
            case "6": System.out.println("\nExiting to main menu...");backToMain = true; break;
            default: System.out.println("Invalid choice.");
        }
    }
}

    public static void quizOne(int a, int b, int c){
        System.out.println("\nThe sum is: " + (a + b + c));
        System.out.println("The product is: " + (a * b * c));
        System.out.println("The result of (a + b) * c is: " + ((a + b)*c));
        System.out.println("The remainder when a is divided by b is: " + (a % b));
    }
    
    public static void quizTwo(){
        Scanner Scanner = App.input;

        while (true) {
        System.out.print("\nEnter student score or 0 to exit: ");
        while (!Scanner.hasNextInt()) { // Loop to stop user from inputting undesired values
            System.out.println("Invalid input. Please enter a valid number.");
            Scanner.next(); // Clear the invalid input
            System.out.print("\nEnter student score or 0 to exit: "); //Prompt user again
        }
        int score = Scanner.nextInt();
        Scanner.nextLine(); // Clear the newline character

        if(score < 0 || score > 100){
            System.out.println("Invalid score");
            continue;
        }else{
            switch (score) {
                case 90, 100:
                    System.out.println("Grade: A");
                    break;
                case 80, 89:
                    System.out.println("Grade: B");
                    break;
                case 70, 79:
                    System.out.println("Grade: C");
                    break;
                case 60, 69:
                    System.out.println("Grade: D");
                    break;
                case 0:
                    System.out.println("Exiting quiz two, goodbye!");
                    return;
                default:
                    System.out.println("Grade: F");
                    break;
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
        Scanner scanner = App.input;
        while (true){
            System.out.print("\nEnter a positive integer, or 0 to exit: ");
            while (!scanner.hasNextInt()) { // Loop to stop user from inputting undesired values
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                System.out.print("\nEnter a positive integer, or 0 to exit: "); //Prompt user again
            }
            int number = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

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
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
