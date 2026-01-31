package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

public class Book extends LibraryItem{
    private String isbn;
    private String genre;

    public Book(String title, String author, String itemId, String isbn, String genre){
        super(title, author, itemId);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
    }

    @Override
    public void checkOut(){
        if (super.getAvailable()) {
            super.setAvailable(false);
            System.out.println("You have successfully checked out: " + getTitle() + " of author " + getAuthor() + " with Item ID " + getItemId() + ".");
        } else {
            System.out.println("Book is not available.");
        }
    }
}
