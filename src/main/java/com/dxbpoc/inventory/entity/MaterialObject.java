package com.dxbpoc.inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name="material_objects")
public class MaterialObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="material_object_id")
    private Long id;
    @Column(name="material_object_name")
    private String name;
    @Column(name="material_object_parent")
    private Long parentId;
    @Column(name="material_objecttype_id")
    private Long objectTypeId;
    @Column(name="material_description")
    private String desc;

}
