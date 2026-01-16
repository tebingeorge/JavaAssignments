package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class InterestService {

    public double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
