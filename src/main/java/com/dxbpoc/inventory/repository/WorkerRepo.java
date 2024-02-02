package com.dxbpoc.inventory.repository;

import com.dxbpoc.inventory.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,Long> {
}
