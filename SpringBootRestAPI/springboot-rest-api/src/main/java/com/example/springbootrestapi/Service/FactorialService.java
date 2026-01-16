package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
