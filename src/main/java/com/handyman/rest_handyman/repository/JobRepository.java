package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
}
