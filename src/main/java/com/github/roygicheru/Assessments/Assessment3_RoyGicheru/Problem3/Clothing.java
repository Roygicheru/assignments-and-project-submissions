package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem3;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material, String color) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.material = material;
        this.color = color;
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
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);   
    }
}
