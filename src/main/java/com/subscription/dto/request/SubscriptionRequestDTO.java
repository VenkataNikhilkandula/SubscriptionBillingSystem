package com.subscription.dto.request;

import lombok.Data;

@Data
public class SubscriptionRequestDTO {
    private Long userId;
    private Long planId;
}