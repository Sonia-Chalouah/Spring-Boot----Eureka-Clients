package com.example.job.Service;

import com.example.job.Entity.Job;
import com.example.job.Repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService implements IJobService{
    private JobRepository jobRepository;
    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> getJobById(long id) {
        return jobRepository.findById(id);
    }

    @Override
    public Optional<Job> getJobByName(String name) {
        return jobRepository.findByService(name);
    }

    @Override
    public void updateJobState(long id, boolean etat) {
        Optional<Job> optionalJob = jobRepository.findById(id);
        if (optionalJob.isPresent()){
            Job job = optionalJob.get();
            job.setEtat(etat);
            jobRepository.save(job);
        }

    }
}
