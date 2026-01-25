package com.github.roygicheru.Assessments.Assessment2_RoyGicheru.Quiz1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, double price, boolean isAvailable) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        setAvailable(isAvailable);
    }

    public String getTitle() { return title;}
    public String getAuthor() { return author;}
    public String getIsbn() { return isbn;}
    public double getPrice() { return price;}
    public boolean getAvailable() { return isAvailable;}

    public void setTitle(String title){
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. Title cannot be null or empty.");
        }
    }

    public void setAuthor(String author){
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author. Author cannot be null or empty.");
        }
    }

    public void setIsbn(String isbn){
        if (isbn != null && !isbn.trim().isEmpty() && isbn.length() == 13) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN. ISBN cannot be null or empty.");
        }
    }

    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Price cannot be negative.");
        }
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void borrowBook(){
        if (isAvailable) {
            setAvailable(false);
            System.out.println("You have successfully borrowed the book: " + getTitle() + " of author " + getAuthor() + " with ISBN " + getIsbn() + " for price Kshs. " + getPrice());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(){
        setAvailable(true);
        System.out.println("You have successfully returned the book: " + getTitle() + " of author " + getAuthor() + " with ISBN " + getIsbn() + " for price Kshs. " + getPrice());
    }

}
