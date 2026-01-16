package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.BasicService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BasicController {

    private final BasicService service;

    public BasicController(BasicService service) {
        this.service = service;
    }

    // 1. Welcome Message API
    @GetMapping("/welcome")
    public String welcome() {
        return service.getWelcomeMessage();
    }

    // 2. Simple Calculator – Addition
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // 3. Even or Odd
    @GetMapping("/evenodd/{num}")
    public String evenOdd(@PathVariable int num) {
        return service.checkEvenOdd(num);
    }

    // 4. Age Category
    @GetMapping("/age/{age}")
    public String ageCategory(@PathVariable int age) {
        return service.getAgeCategory(age);
    }

    // 5. Grade Calculation
    @GetMapping("/grade/{marks}")
    public String grade(@PathVariable int marks) {
        return service.calculateGrade(marks);
    }
}
