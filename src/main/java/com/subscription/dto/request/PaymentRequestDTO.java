package com.subscription.dto.request;

import lombok.Data;

@Data
public class PaymentRequestDTO {
    private Long subscriptionId;
    private Double amount;
    private String method; // UPI / CARD
}