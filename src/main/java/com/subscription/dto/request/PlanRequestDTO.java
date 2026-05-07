package com.subscription.dto.request;

import lombok.Data;

@Data
public class PlanRequestDTO {
    private String name;
    private Double price;
    private String duration;
}