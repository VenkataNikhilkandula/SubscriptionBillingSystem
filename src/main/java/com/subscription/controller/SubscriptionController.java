package com.subscription.controller;

import com.subscription.dto.request.SubscriptionRequestDTO;
import com.subscription.dto.response.SubscriptionResponseDTO;
import com.subscription.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping
    public SubscriptionResponseDTO createSubscription(
            @RequestBody SubscriptionRequestDTO dto) {
        return subscriptionService.createSubscription(dto);
    }

    @GetMapping
    public List<SubscriptionResponseDTO> getAll() {
        return subscriptionService.getAllSubscriptions();
    }
}