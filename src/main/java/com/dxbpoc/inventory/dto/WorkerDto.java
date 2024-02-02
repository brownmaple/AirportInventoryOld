package com.dxbpoc.inventory.dto;

import lombok.Data;

@Data
public class WorkerDto {
    private Long id;
    private String name;
    private Long parentId;
    private Long objectTypeId;
    private String desc;
}
