package com.dxbpoc.inventory.controller;

import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/material")
public class MaterialController {
    @Autowired
    MaterialService materialService;
    @GetMapping("/allTypes")
    public List<MaterialTypeDto> getMaterialTypes(){
        return materialService.getAllMaterialTypes();
    }
}
