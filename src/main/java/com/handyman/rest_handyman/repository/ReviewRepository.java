package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.Review;
import com.handyman.rest_handyman.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, String> {

    @Query("SELECT r FROM Review r WHERE r.serviceProvider.userId = :userId")
    List<Review> findByServiceProvider(String userId);
}
