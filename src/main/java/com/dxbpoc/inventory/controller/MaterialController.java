package com.dxbpoc.inventory.controller;

import com.dxbpoc.inventory.dto.MaterialDto;
import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/material")
public class MaterialController {
    @Autowired
    MaterialService materialService;
    @GetMapping("/types")
    public List<MaterialTypeDto> getMaterialTypes(){
        return materialService.getAllMaterialTypes();
    }

    @GetMapping("/{materialTypeId}")
    public List<MaterialDto> getMaterial(@PathVariable("materialTypeId") Long materialTypeId){
        return materialService.getMaterials(materialTypeId);
    }
}
