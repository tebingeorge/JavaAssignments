package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/helloWorld")
    public void printHelloWorld()
    {
    	System.out.println("Hello World Post Mapping");
    }
    @GetMapping("/GethelloWorld")
    public void printGetHelloWorld()
    {
    	System.out.println("Hello World Get Mapping");
    }
     
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/evenodd/{num}")
    public String checkEvenOdd(@PathVariable int num) {
        return calculatorService.evenOrOdd(num);
    }
}
