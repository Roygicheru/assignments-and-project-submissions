package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz3;

public class Quiz3Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        ScientificCalculator sciCalc = new ScientificCalculator();

        System.out.println("--- Calculator Add Method Overloading ---");
        System.out.println("Add(int, int): " + calc.add(5, 10));
        System.out.println("Add(double, double): " + calc.add(5.5, 10.5));
        System.out.println("Add(int, int, int): " + calc.add(5, 10, 15));
        System.out.println("Add(String, String): " + calc.add("Hello", "World"));

        System.out.println("\n--- Scientific Calculator Add Method Overriding ---");
        sciCalc.add(5, 10);

        System.out.println("\n--- Scientific Calculator Additional Methods ---");
        sciCalc.squareRoot(25);
        sciCalc.power(2, 3);
    }

}