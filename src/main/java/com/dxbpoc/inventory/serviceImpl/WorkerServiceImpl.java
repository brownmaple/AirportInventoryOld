package com.dxbpoc.inventory.serviceImpl;

import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.dto.WorkerDto;
import com.dxbpoc.inventory.entity.Worker;
import com.dxbpoc.inventory.repository.WorkerRepo;
import com.dxbpoc.inventory.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    WorkerRepo workerRepo;
    @Override
    public List<WorkerDto> getAllWorkers() {
        List<Worker> workers = workerRepo.findAll();
        return workers.stream().map(worker -> {
            WorkerDto workerDto = new WorkerDto();
            workerDto.setId(worker.getId());
            workerDto.setName(worker.getName());
            workerDto.setDesc(worker.getDesc());
            workerDto.setParentId(worker.getParentId());
            return workerDto;
        }).collect(Collectors.toList());
    }
}
