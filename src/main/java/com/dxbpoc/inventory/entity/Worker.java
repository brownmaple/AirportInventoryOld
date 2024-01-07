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
@Table(name="ai_worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="worker_id")
    private Long id;

    @Column(name="worker_name")
    private String name;

    @Column(name="worker_parent")
    private Long parentId;

    @Column(name="worker_type_id")
    private Long objectTypeId;

    @Column(name="worker_description")
    private String desc;
}
