package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

public class LibraryManagementSystemMain {
    public static void main(String[] args){
        // Your solution should demonstrate:
        LibraryItem[] items = {
        new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
        new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
        new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };
        // Polymorphic behavior
        for (LibraryItem item : items) {
        item.displayDetails(); // Each should show different information
        item.checkOut(); // Each might have different checkout logic
        }
    }
}
