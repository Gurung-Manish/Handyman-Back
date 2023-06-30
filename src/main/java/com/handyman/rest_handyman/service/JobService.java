package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.Job;

import java.util.List;

public interface JobService {
    public String createJob(Job job);
    public String updateJob(Job job);
    public String deleteJob(String jobId);
    public Job getJob(String jobId);
    public List<Job> getAllJobs();
    public List<Job> getJobByCustomerId(String userId);
    public List<Job> getJobByServiceProviderId(String userId);
}
