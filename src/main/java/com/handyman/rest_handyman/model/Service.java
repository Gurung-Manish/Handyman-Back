package com.handyman.rest_handyman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="service")
public class Service {

    @Id
    private String serviceId;
    private String title;
    private String description;
    private String category;
    private double price;

    @ManyToOne
    private ServiceProvider serviceProvider;

    public Service() {
    }

    public Service(String serviceId, String title, String description, String category, double price, ServiceProvider serviceProvider) {
        this.serviceId = serviceId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.serviceProvider = serviceProvider;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
