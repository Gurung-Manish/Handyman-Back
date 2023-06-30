package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.Review;
import com.handyman.rest_handyman.service.ReviewServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    ReviewServices reviewServices;

    public ReviewController(ReviewServices reviewServices) {
        this.reviewServices = reviewServices;
    }

    @GetMapping({"{reviewId}"})
    public Review getReviewDetails(@PathVariable("reviewId") String reviewId){
        return reviewServices.getReview(reviewId);
    }

    @GetMapping({"user/{userId}"})
    public List<Review> getReviewByServiceProvider(@PathVariable("userId") String userId){
        return reviewServices.getReviewsByServiceId(userId);
    }

    @GetMapping
    public List<Review> getAllReviews(){
        return reviewServices.getAllReviews();
    }

    @PostMapping
    public String createReview(@RequestBody Review review){
        reviewServices.createReview(review);
        return  "Review Created Successfully";
    }

    @PutMapping
    public String updateReview(@RequestBody Review review){
        reviewServices.updateReview(review);
        return  "Review Updated Successfully";
    }

    @DeleteMapping("{reviewId}")
    public String deleteReview(@PathVariable("reviewId") String reviewId){
        reviewServices.deleteReview(reviewId);
        return  "Review Deleted Successfully";
    }


}
