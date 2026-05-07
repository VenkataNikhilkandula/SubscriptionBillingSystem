package com.subscription.service;

public interface BillingService {

    String processPayment(Long subscriptionId);

    Object getPaymentHistory();

    Double calculateRevenue();
}