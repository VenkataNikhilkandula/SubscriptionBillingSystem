package com.subscription.service;

import java.util.Map;

public interface DashboardService {

    Map<String, Object> getSummary();

    Long getTotalUsers();

    Long getActiveSubscriptions();

    Double getTotalRevenue();
}