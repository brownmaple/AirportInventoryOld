package com.dxbpoc.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="material_object_types")
public class MaterialObjectType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="material_objecttype_id")
    private Long id;
    @Column(name="material_objecttype_name")
    private String name;
    @Column(name="material_objecttype_parent")
    private Long parentId;
    @Column(name="material_objecttype_description")
    private String desc;
}
