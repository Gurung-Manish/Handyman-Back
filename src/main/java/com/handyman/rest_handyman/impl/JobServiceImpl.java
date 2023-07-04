package com.handyman.rest_handyman.impl;

import com.handyman.rest_handyman.model.Job;
import com.handyman.rest_handyman.repository.JobRepository;
import com.handyman.rest_handyman.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @Override
    public String createJob(Job job) {
        jobRepository.save(job);
        return "Success to create Jobs";
    }

    @Override
    public String updateJob(Job job) {
        jobRepository.save(job);
        return "Success to update jobs";
    }

    @Override
    public String deleteJob(String jobId) {
        jobRepository.deleteById(jobId);
        return "Success to delete Job";
    }

    @Override
    public Job getJob(String jobId) {
        return jobRepository.findById(jobId).get();
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> getJobByCustomerId(String userId) {
        return jobRepository.getJobByCustomerId(userId);
    }

    @Override
    public List<Job> getJobByServiceProviderId(String userId) {
        return jobRepository.getJobByServiceProviderId(userId);
    }
}
