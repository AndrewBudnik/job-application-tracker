package com.andrew.backend.controller;

import com.andrew.backend.dto.JobApplicationRequest;
import com.andrew.backend.entity.JobApplication;
import com.andrew.backend.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("api/applications")
@RequiredArgsConstructor
public class JobApplicationController {

    private final JobApplicationService service;

    @PostMapping
    public JobApplication create(@RequestBody JobApplicationRequest request) {
        return service.create(request);
    }
    
    @GetMapping
    public List<JobApplication> getAll() {
        return service.getUserApplications();
    }
}
