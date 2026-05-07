package com.subscription.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping("/summary")
    public Map<String, Object> getSummary() {

        // TODO: Replace with real service logic
        Map<String, Object> data = new HashMap<>();
        data.put("totalUsers", 100);
        data.put("activeSubscriptions", 45);
        data.put("revenue", 50000);

        return data;
    }
}