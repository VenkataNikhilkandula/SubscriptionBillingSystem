package com.subscription.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardResponseDTO {
    private Long totalUsers;
    private Long activeSubscriptions;
    private Double revenue;
}