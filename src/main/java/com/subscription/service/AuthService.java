package com.subscription.service;

public interface AuthService {

    String login(String email, String password);

    String register(String name, String email, String password);
}