package com.subscription.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @PostMapping("/pay")
    public String makePayment(@RequestParam Long subscriptionId) {
        // TODO: Integrate PaymentService
        return "Payment successful for subscription: " + subscriptionId;
    }

    @GetMapping("/history")
    public String getPaymentHistory() {
        // TODO: Return actual data
        return "Payment history API";
    }
}