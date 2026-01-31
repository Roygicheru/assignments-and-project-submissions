package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

/* This is a project meant to demonstrate:
 * Inheritance by creating a base class LibraryItem and derived classes Book, DVD, and Magazine.
 * Polymorphism by overriding methods in the derived classes to show different behaviors.
 *@author Roy Gicheru
 */

public class LibraryTest {
    public static void main(String[] args){
        LibraryItem[] items = {
        new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
        new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
        new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };
        // Polymorphic behavior
        for (LibraryItem item : items) {
        item.displayDetails();
        item.checkOut();
        }
    }
}
