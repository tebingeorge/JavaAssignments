package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    // 6. Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 7. Reverse String
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // 8. Palindrome Check
    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    // 9. Factorial
    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // 10. Prime Check
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 11. Discount Calculation
    public double calculateDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }

    // 12. Login Validation
    public String validateLogin(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }

    // 13. Simple Interest
    public double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 14. Word Count
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    // 15. Maximum of Three Numbers
    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
