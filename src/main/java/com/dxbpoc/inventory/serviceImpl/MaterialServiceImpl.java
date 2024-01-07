package com.dxbpoc.inventory.serviceImpl;

import com.dxbpoc.inventory.dto.MaterialDto;
import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.entity.Material;
import com.dxbpoc.inventory.entity.MaterialType;
import com.dxbpoc.inventory.repository.MaterialRepo;
import com.dxbpoc.inventory.repository.MaterialTypeRepo;
import com.dxbpoc.inventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialTypeRepo materialTypeRepo;
    @Autowired
    MaterialRepo materialRepo;
    @Override
    public List<MaterialTypeDto> getAllMaterialTypes() {
        List<MaterialType> materialTypes = materialTypeRepo.findAll();

        return materialTypes.stream().map(materialType -> {
            MaterialTypeDto materialTypeDto = new MaterialTypeDto();
            materialTypeDto.setId(materialType.getId());
            materialTypeDto.setName(materialType.getName());
            materialTypeDto.setDesc(materialType.getDesc());
            materialTypeDto.setParentId(materialType.getParentId());
            return materialTypeDto;
        }).collect(Collectors.toList());
    }

    @Override
    public List<MaterialDto> getMaterials(Long materialTypeId) {
        List<Material> materials = materialRepo.findAll();
        List<Material> materialsFiltered = materials
                .stream().filter(material -> material.getObjectTypeId().equals(materialTypeId)).collect(Collectors.toList());

        return materialsFiltered.stream().map(material -> {
            MaterialDto materialDto = new MaterialDto();
            materialDto.setId(material.getId());
            materialDto.setObjectTypeId(material.getObjectTypeId());
            materialDto.setDesc(material.getDesc());
            materialDto.setName(material.getName());
            materialDto.setParentId(material.getParentId());
            return materialDto;
        }).collect(Collectors.toList());
    }
}
