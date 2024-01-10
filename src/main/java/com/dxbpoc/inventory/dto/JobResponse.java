package com.dxbpoc.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobResponse {
    private Long jobId;
    private Long workerId;
    private Long materialId;
    private String status;

    @Override
    public String toString() {
        return "JobResponse{" +
                "jobId=" + jobId +
                ", workerId=" + workerId +
                ", materialId=" + materialId +
                ", status='" + status + '\'' +
                '}';
    }
}

