package com.dxbpoc.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="ai_material_type")
public class MaterialType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="material_type_id")
    private Long id;

    @Column(name="material_type_name")
    private String name;

    @Column(name="material_type_parent")
    private Long parentId;

    @Column(name="material_type_description")
    private String desc;
}
