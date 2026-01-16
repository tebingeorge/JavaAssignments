package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String getWelcomeMessage() {
        return "Welcome to Spring Boot REST API";
    }
}
