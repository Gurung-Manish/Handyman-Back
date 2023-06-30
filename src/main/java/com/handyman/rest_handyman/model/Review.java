package com.handyman.rest_handyman.model;

import jakarta.persistence.*;

@Entity
@Table(name="review")
public class Review {

    @Id
    private String reviewID;
    @ManyToOne
    private User customer;
    @ManyToOne
    private User serviceProvider;
    private String comment;
    private int ratingValue;

    public Review() {
    }

    public Review(String reviewID, User customer, User serviceProvider, String comment, int ratingValue) {
        this.reviewID = reviewID;
        this.customer = customer;
        this.serviceProvider = serviceProvider;
        this.comment = comment;
        this.ratingValue = ratingValue;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(User serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
}
