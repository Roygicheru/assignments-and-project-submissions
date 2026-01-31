package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz1;
/* This is a project meant to demonstrate encapsulation
    * using a Book class with private fields and public methods
    * to borrow and return a book.
    *@author Roy Gicheru
 */
public class Quiz1Main {
    public static void main(String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890123", true);
        book1.borrowBook();
        book1.returnBook();
        book1.displayDetails();
        
    }
    
}
