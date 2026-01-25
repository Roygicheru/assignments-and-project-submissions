package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz1;

public class Quiz1Main {
    public static void main(String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890123", 10.99, true);
        book1.borrowBook();
        book1.returnBook();
        
    }
    
}
