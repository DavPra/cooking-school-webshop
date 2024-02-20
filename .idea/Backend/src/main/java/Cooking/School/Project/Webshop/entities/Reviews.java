package Cooking.School.Project.Webshop.Entities;

import jakarta.persistence.Entity;

@Entity
public class Reviews {
    private int reviewID;
    private int productID;
    private int customerID;
    private String review;
    private int rating;

    public Reviews() {
    }

    public Reviews(int reviewID, int productID, int customerID, String review, int rating) {
        this.reviewID = reviewID;
        this.productID = productID;
        this.customerID = customerID;
        this.review = review;
        this.rating = rating;
    }

    public int getReviewID() {
        return reviewID;
    }

    public int getProductID() {
        return productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getReview() {
        return review;
    }

    public int getRating() {
        return rating;
    }
}
