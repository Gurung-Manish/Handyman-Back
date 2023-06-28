package com.handyman.rest_handyman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
    @Id
    private String reviewId;

    @ManyToOne
    private User customer;

    @ManyToOne
    private ServiceProvider serviceProvider;

    private String comment;
    private int ratingValue;

    public Review() {
    }

    public Review(String reviewId, User customer, ServiceProvider serviceProvider, String comment, int ratingValue) {
        this.reviewId = reviewId;
        this.customer = customer;
        this.serviceProvider = serviceProvider;
        this.comment = comment;
        this.ratingValue = ratingValue;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
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
