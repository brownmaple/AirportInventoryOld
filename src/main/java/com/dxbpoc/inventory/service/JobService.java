package com.dxbpoc.inventory.service;

import com.dxbpoc.inventory.dto.JobDto;
import com.dxbpoc.inventory.dto.JobResponse;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    JobResponse reserve(JobDto jobDto);
    JobResponse unreserve(JobDto jobDto);
    void getPocTest();
}

