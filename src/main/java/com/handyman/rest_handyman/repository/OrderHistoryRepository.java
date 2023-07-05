package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.Job;
import com.handyman.rest_handyman.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderHistoryRepository extends JpaRepository<OrderHistory, String> {
    @Query("SELECT o FROM OrderHistory o WHERE o.Customer.userId = :userId")
    List<OrderHistory> getOrderHistoriesByCustomerId(@Param("userId") String userId);
}
