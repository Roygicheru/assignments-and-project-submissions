package com.github.roygicheru;

import com.github.roygicheru.CalculatorAssignment.SimpleCalculator_RoyGicheru;
import com.github.roygicheru.Assessments.Assessment1_RoyGicheru;
import java.util.Scanner;

public class App 
{
    public static final Scanner input = new Scanner(System.in);
    public static void main( String[] args ){
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n========= PROJECT HUB ==========");
            System.out.println("1. Simple Calculator");
            System.out.println("2. Assessment 1 (4 Problems)");
            System.out.println("3. Exit");
            System.out.print("\nSelect an option: ");

            // Ensure there is input to read
            if (input.hasNextLine()) {
                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        // Instance call for the Calculator
                        SimpleCalculator_RoyGicheru calculator = new SimpleCalculator_RoyGicheru();
                        calculator.mainTask();
                        break;

                    case "2":
                        // Static call for Assessment 1
                        Assessment1_RoyGicheru.runAssessmentMenu();
                        break;

                    case "3":
                        System.out.println("Exiting the hub. Goodbye!");
                        keepRunning = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

        // Close the scanner only once, at the very end of the program
        input.close();

    }
}
