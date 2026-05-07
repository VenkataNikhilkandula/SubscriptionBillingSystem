package com.subscription.dto.response;

import lombok.Data;

@Data
public class PlanResponseDTO {
    private Long id;
    private String name;
    private Double price;
    private String duration;
}