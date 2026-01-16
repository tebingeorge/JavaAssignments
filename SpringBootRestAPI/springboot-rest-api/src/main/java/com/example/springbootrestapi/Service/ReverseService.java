package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
