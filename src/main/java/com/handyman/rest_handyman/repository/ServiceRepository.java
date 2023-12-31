package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, String> {
    //any new methods that are unique to business, and not provided by default Repository
    @Query("SELECT s FROM Service s WHERE s.serviceProvider.userId = :userId")
    List<Service> findByServiceProviderUserId(@Param("userId") String userId);

    @Query("SELECT s FROM Service s WHERE s.category = :category")
    List<Service> findByCategory(@Param("category") String category);
}
