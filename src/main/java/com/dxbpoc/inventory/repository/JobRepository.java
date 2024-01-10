package com.dxbpoc.inventory.repository;

import com.dxbpoc.inventory.entity.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
}

