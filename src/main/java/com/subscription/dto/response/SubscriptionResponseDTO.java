package com.subscription.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SubscriptionResponseDTO {
    private Long id;
    private String userName;
    private String planName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
}