package com.github.roygicheru.Assessments;

public class Assessment1_RoyGicheru {
    public static void FirstMethod(){
        System.out.println("The area is: " + circleArea(7));
    }
    
    public static double circleArea(int radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
