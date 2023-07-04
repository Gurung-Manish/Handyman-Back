package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.Job;
import com.handyman.rest_handyman.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("{jobId}")
    public Job getJobDetails(@PathVariable("jobId") String jobId){
        return jobService.getJob(jobId);
    }

    @GetMapping
    public List<Job> getAllJobs(){return jobService.getAllJobs();}

    @GetMapping ("user/{userId}")
    public List<Job> getJobDetailsByCustomerId(@PathVariable("userId") String userId){
        return jobService.getJobByCustomerId(userId);
    }

    @GetMapping("user/{userId}")
    public List<Job> getJobDetailsByServiceProviderId(@PathVariable("userId") String userId){
        return jobService.getJobByServiceProviderId(userId);
    }

    @PostMapping
    public String createJob(@RequestBody Job job){
        jobService.createJob(job);
        return "Job Created Successfully";
    }

    @PutMapping
    public String updateJob(@RequestBody Job job){
        jobService.updateJob(job);
        return "Job Updated Successfully";
    }

    @DeleteMapping("{jobId}")
    public String deleteJob(@PathVariable("jobId") String jobId){
        jobService.deleteJob(jobId);
        return "Job Deleted Successfully";
    }
}
