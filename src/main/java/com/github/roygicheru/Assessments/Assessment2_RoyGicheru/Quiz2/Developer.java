package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz2;

public  class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() { return programmingLanguage; }

    public void setProgrammingLanguage(String programmingLanguage){
        if (programmingLanguage != null && !programmingLanguage.trim().isEmpty()) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.out.println("Invalid programming language. It cannot be null or empty.");
        }
    }

    @Override
    public void calculateBonus(){
        if (getSalary() >= 0) {
            double bonus = getSalary() * 0.10;
            System.out.println("Bonus for Developer " + getName() + " is: " + bonus);
        } else {
            System.out.println("Cannot calculate bonus for negative salary.");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + getProgrammingLanguage());
    }
    
}
