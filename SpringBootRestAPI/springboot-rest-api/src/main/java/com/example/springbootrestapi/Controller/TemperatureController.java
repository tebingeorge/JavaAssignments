package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.TemperatureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private final TemperatureService service;

    public TemperatureController(TemperatureService service) {
        this.service = service;
    }

    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convert(@PathVariable double celsius) {
        return service.celsiusToFahrenheit(celsius);
    }
}
