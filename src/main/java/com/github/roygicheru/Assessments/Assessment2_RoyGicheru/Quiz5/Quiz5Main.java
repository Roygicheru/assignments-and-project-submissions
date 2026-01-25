package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz5;

public class Quiz5Main {
    public void questionOne(){
        System.out.println("\n================================================================================");
        System.out.println("\nQuestion one: What is the difference between method overloading and method overriding?");
        System.out.println("\nAnswer: Method Overloading is when multiple methods in the same class have the same name but different parameters, while method overriding is where the behavior/functionality of a method is modified to a function different from the original method.");

        // Example of Method Overloading
            // public int add(int a, int b){ return a + b;}
            // public double add(double a, double b){ return a + b;}
    }

    public void questionTwo(){
        System.out.println("\n================================================================================");
        System.out.println("\nQuestion Two: Why should fields be declared private in a class?");
        System.out.println("\nAnswer: Fields should be declared private in a class to ensure encapsulation, which is the attributes of a class are only accessed by the methods within the class.");

        // Example of private fields with getters and setters
            // public class encapsulation{
            //     private String name; // -> private field.
            //     public String getName(){ return name;}
            //     public void setName(String name){ 
            //         this.name = name;
            //         System.out.println("Name set to: " + name);
            //     }
            // }
    }

    public void questionThree(){
        System.out.println("\n================================================================================");
        System.out.println("\nQuestion Three: When should you use the super keyword?");
        System.out.println("\nAnswer: The super keyword is used to directly access the members and specific attributes of a parent class, such as methods, objects and constructors from the child class, where the child class specifically needs particular elements from the original parent class.");
        // Example of super keyword usage
            // class Parent {
            //     void display(){
            //         System.out.println("Parent class method");
            //     }
            // }
            // class Child extends Parent {
            //     void display(){
            //         super.display(); // Calls parent class method
            //         System.out.println("Child class method.");
            //     }
            // }
            
    }

    public void questionFour(){
        System.out.println("\n================================================================================");
        System.out.println("\nQuestion Four: What is the purpose of the @Override annotation?");
        System.out.println("\nAnswer: It is used to indicate that a method is intended to be overridden from the parent class to the child class and catch compile time errors.");

        // Example of @Override annotation
            // class Animal {
            //     void sound(){
            //         System.out.println("Animal sound");
            //     }
            //     @Override // -> Method overriding
            //     void sound(){
            //         System.out.println("Dog barks.");
            //     }
            // }
    }

    public void questionFive(){
        System.out.println("\n================================================================================");
        System.out.println("\nQuestion Five: How does encapsulation improve code maintainability?");
        System.out.println("\nAnswer: Encapsulation improves code maintainability by hiding the internal structure of the class to only be accessed by the elements within the class, making it easier to modify specific classes without affecting the main codebase.");
        // Example of encapsulation
        // public class encapsulation{
                   /*private field, that can only be accessed within
                   this class, using a getter and setter*/
            //     private String name; 
            //     public String getName(){ return name;} 
            //     public void setName(String name){ 
            //         this.name = name;
            //         System.out.println("Name set to: " + name);
            //     }
            // }
    }

    

    public static void main(String[] args) {
        Quiz5Main quiz5 = new Quiz5Main();
        quiz5.questionOne();
        quiz5.questionTwo();
        quiz5.questionThree();
        quiz5.questionFour();
        quiz5.questionFive();
    }
}
