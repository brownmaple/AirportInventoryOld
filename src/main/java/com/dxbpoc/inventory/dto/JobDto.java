package com.dxbpoc.inventory.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.stereotype.Component;

@Component
@Data
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {

    @JsonProperty("workerId")
    private Long workerId;

    @JsonProperty("materialId")
    private Long materialId;

}

