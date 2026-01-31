package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem4;

/* Analyzing faulty code, along with adding 
    * comments, detecting issues and 
    * correcting them.
    *@author Roy Gicheru 
*/

public class Analysis_RoyGicheru {

    // Faulty original code

    // public static String companyName;
    // private String employeeName;
    // private double salary;

    // public EmployeeManagement(String name) {
    // employeeName = name;
    // }
    // public void setSalary(double salary) {
    // if (salary < 0) {
    // System.out.println("Salary cannot be negative");
    // }
    // salary = salary;
    // }
    // public void calculateBonus() {
    // return salary * 0.1;

    public static String companyName;
    private String employeeName;
    private double salary;

    public Analysis_RoyGicheru(String employeeName /* Changed parameter name to avoid confusion */) {
        // employeeName = name;
        setName(employeeName); // Used setter to set employeeName
    }
    public String getName(){ return employeeName;} // Employee getter
    public double getSalary(){ return salary;} // Salary Getter

    public void setName(String employeeName) { // Introduced new setter for employee name
        this.employeeName = employeeName;
    }
    public void setSalary(double salary) {
    if (salary <= 0) { // Changed if statement so a user cannot have zero salary, along with negative salary
        System.out.println("Salary cannot be negative or zero!");
    }
        this.salary = salary; // Added "this" keyword so that the method knows we are referring to the class variable
    }
    public double calculateBonus() { // Changed return type from void to double
        return salary * 0.1;
    }//Closed calculateBonus method
    public static void main(String[] args) {
        Analysis_RoyGicheru empMgmt = new Analysis_RoyGicheru("John");
        Analysis_RoyGicheru.companyName = "Vision Solutions LTD";
        empMgmt.setSalary(50000.0);
        double bonus = empMgmt.calculateBonus();
        System.out.println(Analysis_RoyGicheru.companyName);
        System.out.println("Original salary: " + empMgmt.getSalary());
        System.out.println("Salary with bonus: " + (empMgmt.getSalary() + bonus));
    }
}
