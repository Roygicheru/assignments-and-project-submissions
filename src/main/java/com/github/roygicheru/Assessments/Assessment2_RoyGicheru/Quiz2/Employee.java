package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz2;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;  

    public Employee(String name, String employeeId, double salary) {
        setName(name);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be null or empty.");
        }
    }

    public void setEmployeeId(String employeeId){
        if (employeeId != null && !employeeId.trim().isEmpty()) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid employee ID. Employee ID cannot be null or empty.");
        }
    }

    public void setSalary(double salary){
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    public void calculateBonus(){
        if (getSalary() >= 0) {
            double bonus = getSalary() * 0.05;
            System.out.println("Bonus for " + getName() + " is: " + bonus);
        } else {
            System.out.println("Cannot calculate bonus for negative salary.");
        }
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + getSalary());
    }
}
