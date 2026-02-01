package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem3;

public class Electronics extends Product {
    private int warrantyPeriod;
    private String powerConsumption;

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, String powerConsumption) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        return this.price * 0.1; // 10% discount for electronics
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Power Consumption: " + powerConsumption);   
    }
}