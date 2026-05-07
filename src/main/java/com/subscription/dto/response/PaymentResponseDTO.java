package com.subscription.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PaymentResponseDTO {
    private Long id;
    private Double amount;
    private String status;
    private String method;
    private LocalDateTime paymentDate;
}