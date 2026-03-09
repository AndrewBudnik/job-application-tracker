package com.andrew.backend.service;

import org.springframework.stereotype.Service;
import com.andrew.backend.dto.JobApplicationRequest;
import com.andrew.backend.entity.JobApplication;
import com.andrew.backend.entity.User;
import com.andrew.backend.repository.JobApplicationRepository;
import com.andrew.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobApplicationService {
    
    private final JobApplicationRepository jobRepository;
    private final UserRepository userRepository;

    private User getCurrentUser() {

        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        return userRepository.findByEmail(email).orElseThrow();
    }

    public JobApplication create(JobApplicationRequest request) {

        User user = getCurrentUser();

        JobApplication app = JobApplication.builder()
                .company(request.getCompany())
                .title(request.getTitle())
                .status(request.getStatus())
                .location(request.getLocation())
                .salary(request.getSalary())
                .notes(request.getNotes())
                .appliedDate(request.getAppliedDate())
                .user(user)
                .build();

        return jobRepository.save(app);
    }

    public List<JobApplication> getUserApplications() {

        User user = getCurrentUser();
        return jobRepository.findByUser(user);
    }
}
