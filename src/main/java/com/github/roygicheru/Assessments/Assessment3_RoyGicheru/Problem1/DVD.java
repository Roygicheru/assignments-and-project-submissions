package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

public class DVD extends LibraryItem{
    private int duration;
    private String rating;

    public DVD(String title, String author, String itemId, int duration, String rating){
        super(title, author, itemId);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Duration: " + duration);
        System.out.println("Rating: " + rating);
    }

    @Override
    public void checkOut(){
        if (super.getAvailable()) {
            super.setAvailable(false);
            System.out.println("You have successfully checked out: " + getTitle() + " of author " + getAuthor() + " with Item ID " + getItemId() + ".");
        } else {
            System.out.println("DVD is not available.");
        }
    }
}
