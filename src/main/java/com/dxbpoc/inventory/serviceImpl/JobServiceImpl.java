package com.dxbpoc.inventory.serviceImpl;

import com.dxbpoc.inventory.dto.JobDto;
import com.dxbpoc.inventory.dto.JobResponse;
import com.dxbpoc.inventory.entity.Job;
import com.dxbpoc.inventory.entity.Material;
import com.dxbpoc.inventory.repository.JobRepository;
import com.dxbpoc.inventory.repository.MaterialRepo;
import com.dxbpoc.inventory.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@Configuration
public class JobServiceImpl implements JobService {

    @Autowired
    JobDto jobDto;

    @Autowired
    JobRepository jobRepo;

    @Autowired
    MaterialRepo materialRepo;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void getPocTest() {
        log.info("inside service class");
    }

    @Override
    public JobResponse reserve(JobDto jobDto) {
        log.info("start to reserve");
        modelMapper().getConfiguration().setAmbiguityIgnored(true);
        Job job = modelMapper().map(jobDto, Job.class);
        job.setStatus("Reserved");
        Job savedJob = jobRepo.save(job);

        Optional<Material> matById = materialRepo.findById(jobDto.getMaterialId());
        //need to handle proper empty check and transaction handling
        Material mat = matById.orElse(null);
        mat.setStatus("reserved");
        materialRepo.save(mat);

        JobResponse jobResponse = modelMapper().map(savedJob, JobResponse.class);
        log.info("JobResponse values {}",
                jobResponse.toString());
        log.info("end of reserve");
        return  jobResponse;
    }

    @Override
    public JobResponse unreserve(JobDto jobDto) {
        log.info("start to unreserve");
        modelMapper().getConfiguration().setAmbiguityIgnored(true);
        Job job = modelMapper().map(jobDto, Job.class);
        job.setStatus("Unreserved");
        Job savedJob = jobRepo.save(job);

        Optional<Material> matById = materialRepo.findById(jobDto.getMaterialId());
        //need to handle proper empty check and transaction handling
        Material mat = matById.orElse(null);
        mat.setStatus("unreserved");
        materialRepo.save(mat);

        JobResponse jobResponse = modelMapper().map(savedJob, JobResponse.class);
        log.info("JobResponse values {}",
                jobResponse.toString());
        log.info("end of unreserve");
        return  jobResponse;
    }

}

