package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class MaxNumberService {

    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
