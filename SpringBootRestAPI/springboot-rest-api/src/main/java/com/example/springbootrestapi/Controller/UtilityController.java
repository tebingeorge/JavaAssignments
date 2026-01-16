package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.UtilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UtilityController {

    private final UtilityService service;

    public UtilityController(UtilityService service) {
        this.service = service;
    }

    // 6. Temperature Conversion API
    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convertTemperature(@PathVariable double celsius) {
        return service.celsiusToFahrenheit(celsius);
    }

    // 7. String Reverse API
    @GetMapping("/reverse/{text}")
    public String reverseString(@PathVariable String text) {
        return service.reverse(text);
    }

    // 8. Palindrome Check API
    @GetMapping("/palindrome/{word}")
    public String checkPalindrome(@PathVariable String word) {
        return service.isPalindrome(word) ? "Palindrome" : "Not Palindrome";
    }

    // 9. Factorial API
    @GetMapping("/factorial/{num}")
    public long factorial(@PathVariable int num) {
        return service.factorial(num);
    }

    // 10. Prime Number Check API
    @GetMapping("/prime/{num}")
    public String checkPrime(@PathVariable int num) {
        return service.isPrime(num) ? "Prime Number" : "Not Prime";
    }

    // 11. Discount Calculation API
    @GetMapping("/discount")
    public double calculateDiscount(@RequestParam double price,
                                    @RequestParam double discount) {
        return service.calculateDiscount(price, discount);
    }

    // 12. Login Validation API
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        return service.validateLogin(username, password);
    }

    // 13. Simple Interest API
    @GetMapping("/interest")
    public double simpleInterest(@RequestParam double p,
                                 @RequestParam double r,
                                 @RequestParam double t) {
        return service.calculateInterest(p, r, t);
    }

    // 14. Word Count API
    @PostMapping("/wordcount")
    public int wordCount(@RequestBody String text) {
        return service.countWords(text);
    }

    // 15. Maximum of Three Numbers API
    @GetMapping("/max")
    public int findMax(@RequestParam int a,
                       @RequestParam int b,
                       @RequestParam int c) {
        return service.maxOfThree(a, b, c);
    }
}
