package Cooking.School.Project.Webshop.Entities;

import jakarta.persistence.Entity;

@Entity
public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private double price;
    private int stock;
    private String category;

    public Product() {
    }

    public Product(int productID, String productName, String productDescription, double price, int stock, String category) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }
}
