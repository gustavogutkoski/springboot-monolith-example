package com.example.monolith.entities.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();

    void createJob(Job job);

    Job findById(Long id);

    boolean deleteById(Long id);

    boolean updateById(Long id, Job updatedJob);
}
