package com.handyman.rest_handyman.impl;

import com.handyman.rest_handyman.model.Review;
import com.handyman.rest_handyman.repository.ReviewRepository;
import com.handyman.rest_handyman.service.ReviewServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewServices {

    ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public String createReview(Review review) {
        reviewRepository.save(review);
        return "Success to save review";
    }

    @Override
    public String updateReview(Review review) {
        reviewRepository.save(review);
        return "Success to update review";
    }

    @Override
    public String deleteReview(String reviewId) {
        reviewRepository.deleteById(reviewId);
        return "Success to delete review";
    }

    @Override
    public Review getReview(String reviewId) {
        return reviewRepository.findById(reviewId).get();
    }

    @Override
    public List<Review> getReviewsByServiceId(String serviceId) {
        return reviewRepository.findByServiceProvider(serviceId);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
