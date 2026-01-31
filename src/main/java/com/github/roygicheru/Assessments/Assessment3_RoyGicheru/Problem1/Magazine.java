package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem1;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private String publicationMonth;

    public Magazine(String title, String author, String itemId, int issueNumber, String publicationMonth){
        super(title, author, itemId);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publication Month: " + publicationMonth);
    }

    @Override
    public void checkOut(){
        if (super.getAvailable()) {
            super.setAvailable(false);
            System.out.println("You have successfully checked out: " + getTitle() + " of author " + getAuthor() + " with Item ID " + getItemId() + ".");
        } else {
            System.out.println("Magazine is not available.");
        }
    }
    
}
