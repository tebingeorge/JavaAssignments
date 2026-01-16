package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.MaxNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxNumberController {

    private final MaxNumberService service;

    public MaxNumberController(MaxNumberService service) {
        this.service = service;
    }

    @GetMapping("/max")
    public int findMax(@RequestParam int a,
                       @RequestParam int b,
                       @RequestParam int c) {
        return service.maxOfThree(a, b, c);
    }
}
