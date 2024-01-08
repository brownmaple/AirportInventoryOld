package com.dxbpoc.inventory.service;

import com.dxbpoc.inventory.dto.JobDto;
import com.dxbpoc.inventory.dto.JobResponse;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    public JobResponse reserve(JobDto jobDto);
    public JobResponse unreserve(JobDto jobDto);
    public void getPocTest();
}
