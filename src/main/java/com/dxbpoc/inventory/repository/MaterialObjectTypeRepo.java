package com.dxbpoc.inventory.repository;

import com.dxbpoc.inventory.entity.MaterialObject;
import com.dxbpoc.inventory.entity.MaterialObjectType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialObjectTypeRepo extends JpaRepository<MaterialObjectType,Long> {

}
