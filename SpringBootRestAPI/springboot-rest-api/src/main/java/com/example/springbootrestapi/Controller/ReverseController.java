package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.ReverseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    private final ReverseService service;

    public ReverseController(ReverseService service) {
        this.service = service;
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return service.reverse(text);
    }
}
