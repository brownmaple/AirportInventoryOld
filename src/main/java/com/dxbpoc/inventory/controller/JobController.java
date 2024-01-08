package com.dxbpoc.inventory.controller;

import com.dxbpoc.inventory.dto.JobDto;
import com.dxbpoc.inventory.dto.JobResponse;
import com.dxbpoc.inventory.serviceImpl.JobServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/v1/material")
//@Tag(name = "Job to reserve or unreserve", description = "Job to reserve or unreserve")
public class JobController {

    @Autowired
    JobServiceImpl jobService;

    @GetMapping("/test")
    public void getPocDetails() {
        log.info("inside job controller");
        jobService.getPocTest();
    }

    @PostMapping("/reserve")
    public JobResponse materialReserve(@RequestBody JobDto jobDto) {
        log.info("inside materialReserve");
        return jobService.reserve(jobDto);
    }

    @PostMapping("/unreserve")
    public JobResponse materialUnreserve(@RequestBody JobDto jobDto) {
        log.info("inside materialUnreserve");
        return jobService.unreserve(jobDto);
    }
}
