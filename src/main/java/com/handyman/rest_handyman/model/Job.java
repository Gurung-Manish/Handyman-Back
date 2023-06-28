package com.handyman.rest_handyman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="job")
public class Job {

    @Id
    private String jobId;
    private String title;
    private String description;
    private String status;

    @ManyToOne
    private User customer;

    @ManyToOne
    private ServiceProvider serviceProvider;

    public Job() {
    }

    public Job(String jobId, String title, String description, String status, User customer, ServiceProvider serviceProvider) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.customer = customer;
        this.serviceProvider = serviceProvider;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
