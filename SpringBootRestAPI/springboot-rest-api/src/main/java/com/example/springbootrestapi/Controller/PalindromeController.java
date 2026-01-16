package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.PalindromeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    private final PalindromeService service;

    public PalindromeController(PalindromeService service) {
        this.service = service;
    }

    @GetMapping("/palindrome/{word}")
    public String check(@PathVariable String word) {
        return service.isPalindrome(word);
    }
}
