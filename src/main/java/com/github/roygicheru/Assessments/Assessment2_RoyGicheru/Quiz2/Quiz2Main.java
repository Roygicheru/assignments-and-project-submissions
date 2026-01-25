package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz2;

public class Quiz2Main {
    public static void main(String[] args){
        Employee emp = new Employee("Alice Johnson", "Emp001", 60000.0);
        Manager mgr = new Manager("Bob Smith", "Mng001", 80000.0, "Sales");
        Developer dev = new Developer("Charlie Brown", "Dev001", 70000.0, "Java");

        System.out.println("\n--- Employee Details ---");
        emp.calculateBonus();
        emp.displayInfo();

        System.out.println("\n--- Manager Details ---");
        mgr.calculateBonus();
        mgr.displayInfo();

        System.out.println("\n--- Developer Details ---");
        dev.calculateBonus();
        dev.displayInfo();
    }
}
