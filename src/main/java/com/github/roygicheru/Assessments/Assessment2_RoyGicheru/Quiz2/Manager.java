package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz2;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        setDepartment(department);
    }

    public String getDepartment() { return department; }

    public void setDepartment(String department){
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Invalid department. Department cannot be null or empty.");
        }
    }

    @Override
    public void calculateBonus(){
        if (getSalary() >= 0) {
            double bonus = getSalary() * 0.15;
            System.out.println("Bonus for Manager " + getName() + " is: " + bonus);
        } else {
            System.out.println("Cannot calculate bonus for negative salary.");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department: " + getDepartment());
    }
    
}
