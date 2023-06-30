package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.Review;
import com.handyman.rest_handyman.model.Service;

import java.util.List;

public interface ReviewServices {
    //all methods to be implemented for business layer

    public String createReview(Review review);
    public String updateReview(Review review);
    public String deleteReview(String reviewId);
    public Review getReview(String reviewId);
    public List<Review> getReviewsByServiceId(String serviceId);
    public List<Review> getAllReviews();
}
