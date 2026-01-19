package com.github.roygicheru.Hello;



public class Hello1 {
    public static void FirstMethod(){
        System.out.println("The area is: " + circleArea(7));
    }
    
    public static double circleArea(int radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

}
