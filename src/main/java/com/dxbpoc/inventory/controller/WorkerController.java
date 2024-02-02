package com.dxbpoc.inventory.controller;

import com.dxbpoc.inventory.dto.WorkerDto;
import com.dxbpoc.inventory.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/worker")
public class WorkerController {
    @Autowired
    WorkerService workerService;

    @GetMapping("/allworkers")
    @CrossOrigin
    public List<WorkerDto> getWorkers(){
        return workerService.getAllWorkers();
    }
}
