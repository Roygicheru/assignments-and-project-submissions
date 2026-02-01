package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem3;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stockQuantity, String author, String publisher, String isbn) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return this.price * 0.15; // 15% discount for books
    }

    @Override
    public String getProductType() {
        return "Books";
    }
    
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbn);   
    }
}
