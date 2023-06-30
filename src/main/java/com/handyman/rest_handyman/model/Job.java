package com.handyman.rest_handyman.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "job")
public class Job {
    @Id
    private String jobId;
    private String title;
    private String description;
    private String Status;
    @ManyToOne
    @JoinColumn(name = "customer_user_id")
    private User Customer;
    @ManyToOne
    @JoinColumn(name = "service_provider_user_id")
    private User ServiceProvider;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date scheduledDateTime;
    @ManyToOne
    @JoinColumn(name = "service_service_id")
    private Service service;

    public Job() {
    }

    public Job(String jobId, String title, String description, String status, User customer, User serviceProvider, Date scheduledDateTime, Service service) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        Status = status;
        Customer = customer;
        ServiceProvider = serviceProvider;
        this.scheduledDateTime = scheduledDateTime;
        this.service = service;
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
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public User getCustomer() {
        return Customer;
    }

    public void setCustomer(User customer) {
        Customer = customer;
    }

    public User getServiceProvider() {
        return ServiceProvider;
    }

    public void setServiceProvider(User serviceProvider) {
        ServiceProvider = serviceProvider;
    }

    public Date getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(Date scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
