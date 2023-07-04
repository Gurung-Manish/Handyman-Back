package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.Job;
import com.handyman.rest_handyman.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, String> {
    @Query("SELECT j FROM Job j WHERE j.Customer.userId = :userId")
    List<Job> getJobByCustomerId(String userId);
    @Query("SELECT j FROM Job j WHERE j.ServiceProvider.userId = :userId")
    List<Job> getJobByServiceProviderId(String userId);
}
