package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz3;

public class ScientificCalculator extends Calculator {
    @Override
    public int add(int a, int b) { // Method Overriding
        int result = a + b;
        System.out.println("Scientific Add (int): " + result);
        return result;
    }

    public void squareRoot(double number) {
        if (number >= 0) {
            double result = Math.sqrt(number);
            System.out.println("Square Root: " + result);
        } else {
            System.out.println("Cannot compute square root of a negative number.");
        }
    }

    public void power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("Power: " + result);
    }
    
}
