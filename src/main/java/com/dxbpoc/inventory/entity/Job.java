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
@Table(name="ai_job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private Long jobId;

    @Column(name="worker_id")
    private Long workerId;

    @Column(name="material_id")
    private Long materialId;

    @Column(name="job_description")
    private String jobDescription;

    @Column(name="job_status")
    private String status;
}
