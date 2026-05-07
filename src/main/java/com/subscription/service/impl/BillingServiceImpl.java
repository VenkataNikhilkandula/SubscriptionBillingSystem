package com.subscription.service.impl;

import com.subscription.service.BillingService;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements BillingService {

    @Override
    public String processPayment(Long subscriptionId) {
        // TODO: integrate Payment entity
        return "Payment processed for subscription: " + subscriptionId;
    }

    @Override
    public Object getPaymentHistory() {
        return "Payment history (to be implemented)";
    }

    @Override
    public Double calculateRevenue() {
        // TODO: sum payments
        return 0.0;
    }
}