package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.FactorialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    private final FactorialService service;

    public FactorialController(FactorialService service) {
        this.service = service;
    }

    @GetMapping("/factorial/{num}")
    public long factorial(@PathVariable int num) {
        return service.factorial(num);
    }
}
