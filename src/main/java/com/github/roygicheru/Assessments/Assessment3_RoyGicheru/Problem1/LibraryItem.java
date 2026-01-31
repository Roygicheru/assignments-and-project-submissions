package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

public class LibraryItem {
    private String title;
    private String author;
    private String itemId;
    private boolean isAvailable = true;

    public LibraryItem(String title, String author, String itemId) {
        setTitle(title);
        setAuthor(author);
        setItemId(itemId);
    }

    public String getTitle() { return title;}
    public String getAuthor() { return author;}
    public String getItemId() { return itemId;}
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

    public void setItemId(String itemId){
        if (itemId != null && !itemId.trim().isEmpty()) {
            this.itemId = itemId;
        } else {
            System.out.println("Invalid Item ID. Item ID cannot be null or empty.");
        }
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void checkOut(){
        if (isAvailable) {
            setAvailable(false);
            System.out.println("You have successfully checked out: " + getTitle() + " of author " + getAuthor() + " with Item ID " + getItemId() + ".");
        } else {
            System.out.println("Library item is not available.");
        }
    }

    public void returnItem(){
        setAvailable(true);
        System.out.println("You have successfully returned the book: " + getTitle() + " of author " + getAuthor() + " with Item ID " + getItemId() + ".");
    }

    public void displayDetails(){
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Book Item ID: " + getItemId());
    }
}
