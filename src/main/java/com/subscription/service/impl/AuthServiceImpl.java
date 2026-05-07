package com.subscription.service.impl;

import com.subscription.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        // TODO: Replace with DB + JWT
        if ("admin@example.com".equals(email)) {
            return "Login Successful (Mock Token)";
        }
        throw new RuntimeException("Invalid credentials");
    }

    @Override
    public String register(String name, String email, String password) {
        // TODO: Save user to DB
        return "User registered successfully";
    }
}