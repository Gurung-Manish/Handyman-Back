package com.handyman.rest_handyman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="service_provider")
public class ServiceProvider {

    @Id
    private String serviceProviderId;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Service> services;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Review> reviews;

    public ServiceProvider() {
    }

    public ServiceProvider(String serviceProviderId, List<Service> services, List<Review> reviews) {
        this.serviceProviderId = serviceProviderId;
        this.services = services;
        this.reviews = reviews;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
