package com.example.job.Service;

import com.example.job.Entity.Job;

import java.util.List;
import java.util.Optional;

public interface IJobService {
    List<Job> getAllJobs();
    Optional<Job> getJobById(long id);
    Optional<Job> getJobByName(String name);
    void updateJobState(long id, boolean etat);
}
