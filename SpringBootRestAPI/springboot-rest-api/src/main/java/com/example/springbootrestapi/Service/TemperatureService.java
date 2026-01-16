package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
