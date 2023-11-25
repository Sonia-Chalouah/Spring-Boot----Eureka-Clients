package com.example.job.Controller;

import com.example.job.Entity.Job;
import com.example.job.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("{id}")
    public Optional<Job> getJobById(@PathVariable long id){
        return jobService.getJobById(id);
    }

    @GetMapping("/name/{name}")
    public Optional<Job> getJobByName(@PathVariable String name){
        return jobService.getJobByName(name);
    }

    @PatchMapping("{id}/update-state")
    public void updateJobState(@PathVariable Long id ,@RequestParam boolean etat ){
        jobService.updateJobState(id,etat);
    }
}
