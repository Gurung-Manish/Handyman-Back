package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, String> {
}
