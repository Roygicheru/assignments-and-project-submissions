package com.github.roygicheru.Assessments.Assessment3_RoyGicheru.Problem3;

/* Completed the following tasks:
   1. Created a custom exception class named InvalidProductException that extends Exception.
   2. Created a base class named Product with attributes id, name, price, and stockQuantity.
   3. Implemented methods in the Product class to display product information, apply tax, and reduce stock quantity.
   4. Created a subclass named Electronics that extends Product and adds attributes warrantyPeriod and powerConsumption.
   5. Implemented a method in the Electronics class to calculate discounts based on power consumption.
   6. Wrote a test class named ECommerceTest to demonstrate the functionality of the Product and Electronics classes,
      including exception handling for invalid products and out-of-stock scenarios.

    @author: Roy Gicheru
 */

public class ECommerceTest {
    public static void main(String[] args) {
        try {
            // Product laptop = new Electronics("E001", "Laptop", -999.99, 10); // Invalid price
            Product laptop = new Electronics("1021", "Dell XPS", 1299.99, 40, 36, "Medium");
            Product laptop2 = new Electronics("1020", "HP ENVY", 999.99, 10, 24, "Low");

            laptop.displayProductInfo();
            laptop.applyTax(0.15); // 15% tax
            laptop.reduceStock(10);
            System.out.println("Discount on " + laptop2.name + ": " + laptop2.calculateDiscount());


            laptop2.reduceStock(15); // More than available stock
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
