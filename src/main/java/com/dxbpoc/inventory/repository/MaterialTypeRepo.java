package com.dxbpoc.inventory.repository;

import com.dxbpoc.inventory.entity.MaterialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialTypeRepo extends JpaRepository<MaterialType,Long> {

}
