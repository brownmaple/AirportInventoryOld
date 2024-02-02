package com.dxbpoc.inventory.service;

import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.dto.WorkerDto;
import com.dxbpoc.inventory.entity.Worker;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorkerService {
    public List<WorkerDto> getAllWorkers();
}
