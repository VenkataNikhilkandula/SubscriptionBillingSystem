package com.subscription.service;

import com.subscription.dto.request.SubscriptionRequestDTO;
import com.subscription.dto.response.SubscriptionResponseDTO;

import java.util.List;

public interface SubscriptionService {
    SubscriptionResponseDTO createSubscription(SubscriptionRequestDTO dto);
    List<SubscriptionResponseDTO> getAllSubscriptions();
}