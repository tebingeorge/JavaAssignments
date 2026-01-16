package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
