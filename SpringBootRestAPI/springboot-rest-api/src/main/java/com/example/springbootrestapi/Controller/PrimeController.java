package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.PrimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    private final PrimeService service;

    public PrimeController(PrimeService service) {
        this.service = service;
    }

    @GetMapping("/prime/{num}")
    public String prime(@PathVariable int num) {
        return service.isPrime(num);
    }
}
