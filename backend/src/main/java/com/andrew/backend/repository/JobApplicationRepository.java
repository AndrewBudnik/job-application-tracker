package com.andrew.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andrew.backend.entity.User;
import com.andrew.backend.entity.JobApplication;

import java.util.List;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    
    List<JobApplication> findByUser(User user);
}
