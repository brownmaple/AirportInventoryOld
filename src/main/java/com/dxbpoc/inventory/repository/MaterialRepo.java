package com.dxbpoc.inventory.repository;

import com.dxbpoc.inventory.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepo extends JpaRepository<Material,Long> {

}
