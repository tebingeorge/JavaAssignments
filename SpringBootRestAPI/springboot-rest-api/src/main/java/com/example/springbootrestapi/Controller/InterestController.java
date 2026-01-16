package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.InterestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    private final InterestService service;

    public InterestController(InterestService service) {
        this.service = service;
    }

    @GetMapping("/interest")
    public double calculateInterest(@RequestParam double p,
                                    @RequestParam double r,
                                    @RequestParam double t) {
        return service.calculateInterest(p, r, t);
    }
}
