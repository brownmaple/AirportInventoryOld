package com.dxbpoc.inventory.controller;

import com.dxbpoc.inventory.dto.MaterialDto;
import com.dxbpoc.inventory.dto.MaterialTypeDto;
import com.dxbpoc.inventory.dto.WorkerDto;
import com.dxbpoc.inventory.service.MaterialService;
import com.dxbpoc.inventory.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/material")
public class MaterialController {
    @Autowired
    MaterialService materialService;
    @GetMapping("/types")
    @CrossOrigin
    public List<MaterialTypeDto> getMaterialTypes(){
        return materialService.getAllMaterialTypes();
    }

    @GetMapping("/{materialTypeId}/{flag}")
    @CrossOrigin
    public List<MaterialDto> getMaterial(@PathVariable("materialTypeId") Long materialTypeId,
                                         @PathVariable("flag") String flag){
        String status = flag.equals("1")?"unreserved":"reserved";
        return materialService.getMaterials(materialTypeId, status);
    }
}
