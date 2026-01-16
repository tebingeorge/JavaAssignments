package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public String isPalindrome(String word) {
        String rev = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome";
    }
}
