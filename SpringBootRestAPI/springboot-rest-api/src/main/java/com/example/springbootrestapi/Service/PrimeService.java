package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

    public String isPrime(int num) {
        if (num <= 1) {
            return "Not Prime";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
