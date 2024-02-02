package com.dxbpoc.inventory.service;

import com.dxbpoc.inventory.dto.MaterialDto;
import com.dxbpoc.inventory.dto.MaterialTypeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterialService {
    public List<MaterialTypeDto> getAllMaterialTypes();

    public List<MaterialDto> getMaterials(Long materialTypeId, String status);
}
