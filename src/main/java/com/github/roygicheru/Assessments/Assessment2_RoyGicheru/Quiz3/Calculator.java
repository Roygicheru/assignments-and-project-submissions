package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz3;

public class Calculator {
    public int add(int a, int b) { // Method Overloading
        int result = a + b;
        return result;
    }

    public double add(double a, double b) { // Method Overloading
        double result = a + b;
        return result;
    }

    public double add(int a, int b, int c) { // Method Overloading
        double result = a + b + c;
        return result;
    }

    public String add(String a, String b) { // Method Overloading
        String result = a + b;
        return result;
    }
}