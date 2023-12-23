package com.dxbpoc.inventory.serviceImpl;

import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.entity.MaterialObjectType;
import com.dxbpoc.inventory.repository.MaterialObjectTypeRepo;
import com.dxbpoc.inventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialObjectTypeRepo materialObjectTypeRepo;
    @Override
    public List<MaterialTypeDto> getAllMaterialTypes() {
        List<MaterialObjectType> materialObjectTypes = materialObjectTypeRepo.findAll();

        return materialObjectTypes.stream().map(materialObjectType -> {
            MaterialTypeDto materialTypeDto = new MaterialTypeDto();
            materialTypeDto.setId(materialObjectType.getId());
            materialTypeDto.setName(materialObjectType.getName());
            materialTypeDto.setDesc(materialObjectType.getDesc());
            materialTypeDto.setParentId(materialObjectType.getParentId());
            return materialTypeDto;
        }).toList();
    }
}
