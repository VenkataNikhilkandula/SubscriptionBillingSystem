package com.subscription.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        // TODO: Replace with JWT logic
        if ("admin@gmail.com".equals(request.getEmail())) {
            return "Login Successful (Mock Token)";
        }
        return "Invalid Credentials";
    }

    @Data
    static class LoginRequest {
        private String email;
        private String password;
    }
}