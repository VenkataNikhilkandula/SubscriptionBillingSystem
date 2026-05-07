package com.subscription.service.impl;

import com.subscription.repository.SubscriptionRepository;
import com.subscription.repository.UserRepository;
import com.subscription.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {

    private final UserRepository userRepository;
    private final SubscriptionRepository subscriptionRepository;

    @Override
    public Map<String, Object> getSummary() {
        Map<String, Object> map = new HashMap<>();
        map.put("totalUsers", getTotalUsers());
        map.put("activeSubscriptions", getActiveSubscriptions());
        map.put("revenue", getTotalRevenue());
        return map;
    }

    @Override
    public Long getTotalUsers() {
        return userRepository.count();
    }

    @Override
    public Long getActiveSubscriptions() {
        return subscriptionRepository.count(); // improve later with status filter
    }

    @Override
    public Double getTotalRevenue() {
        return 0.0; // connect Billing later
    }
}