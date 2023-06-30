package com.handyman.rest_handyman.model;

import jakarta.persistence.*;

@Entity
@Table(name="service")
public class Service {
    @Id
    private String serviceId;
    @ManyToOne
    @JoinColumn(name = "service_provider_user_id")
    private User serviceProvider;
    private String title;
    private String description;
    private String category;
    private double price;

    public Service() {
    }

    public Service(String serviceId, User serviceProvider, String title, String description, String category, double price) {
        this.serviceId = serviceId;
        this.serviceProvider = serviceProvider;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public User getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(User serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
