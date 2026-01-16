package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.DiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    private final DiscountService service;

    public DiscountController(DiscountService service) {
        this.service = service;
    }

    @GetMapping("/discount")
    public double calculateDiscount(@RequestParam double price,
                                    @RequestParam double discount) {
        return service.calculateDiscount(price, discount);
    }
}
