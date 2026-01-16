package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double calculateDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }
}
