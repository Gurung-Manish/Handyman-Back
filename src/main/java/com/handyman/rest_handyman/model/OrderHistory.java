package com.handyman.rest_handyman.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="order_history")
public class OrderHistory {
    @Id
    private String orderHistoryId;
    private String progress;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    @ManyToOne
    @JoinColumn(name="job_job_id")
    private Job job;
    @ManyToOne
    @JoinColumn(name = "customer_user_id")
    private User Customer;
    @ManyToOne
    @JoinColumn(name = "service_provider_user_id")
    private User ServiceProvider;


    public OrderHistory() {
    }

    public OrderHistory(String orderHistoryId, String progress, Date date, Job job, User customer, User serviceProvider) {
        this.orderHistoryId = orderHistoryId;
        this.progress = progress;
        this.date = date;
        this.job = job;
        Customer = customer;
        ServiceProvider = serviceProvider;
    }

    public String getOrderHistoryId() {
        return orderHistoryId;
    }

    public void setOrderHistoryId(String orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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
}
