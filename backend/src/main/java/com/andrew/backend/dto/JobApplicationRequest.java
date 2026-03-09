package com.andrew.backend.dto;

import java.time.LocalDate;

import com.andrew.backend.entity.ApplicationStatus;
import lombok.Data;

@Data
public class JobApplicationRequest {
    
    private String company;

    private String title;

    private ApplicationStatus status;

    private String location;

    private Integer salary;

    private String notes;

    private LocalDate appliedDate;
}
