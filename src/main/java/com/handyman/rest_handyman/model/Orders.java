package com.handyman.rest_handyman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

    @Id
    private String orderId;

    @ManyToOne
    private Job job;

    @ManyToOne
    private User customer;

    @ManyToOne
    private ServiceProvider serviceProvider;

    private String progress;

    public Orders() {
    }

    public Orders(String orderId, Job job, User customer, ServiceProvider serviceProvider, String progress) {
        this.orderId = orderId;
        this.job = job;
        this.customer = customer;
        this.serviceProvider = serviceProvider;
        this.progress = progress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
