package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) throws InvalidProductException {
        // Validate inputs and throw exceptions if invalid
        if (productId == null || productId.isEmpty()) {
            throw new InvalidProductException("Product ID cannot be null or empty!");
        } else if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Product name cannot be null or empty");
        } else if (price <= 0) {
            throw new InvalidProductException("Product price must be greater than zero!");
        } else if (stockQuantity < 0) {
            throw new InvalidProductException("Product stock quantity cannot be negative!");
        } else {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.stockQuantity = stockQuantity;
        }
    }
    public abstract double calculateDiscount();
    public abstract String getProductType();

    public void reduceStock(int quantity) throws OutOfStockException {
    // Implement stock reduction with exception handling
        if (quantity > stockQuantity){
            throw new OutOfStockException("Insufficient stock for product: " + this.name);
        }
        this.stockQuantity -= quantity;
        System.out.println("Stock reduced by " + quantity + " for product: " + this.name + ". New stock: " + this.stockQuantity);
    }

    public void applyTax(double taxRate) {
        this.price += this.price * taxRate;
        System.out.println("New price after tax for " + this.name + ": " + this.price);
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}
