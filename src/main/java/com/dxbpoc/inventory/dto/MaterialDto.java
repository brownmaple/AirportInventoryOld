package com.dxbpoc.inventory.dto;

import lombok.Data;

@Data
public class MaterialDto {
    private Long id;
    private String name;
    private Long parentId;
    private String desc;
    private Long objectTypeId;
}
