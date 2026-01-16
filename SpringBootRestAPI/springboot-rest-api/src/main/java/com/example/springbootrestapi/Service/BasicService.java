package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    // 1. Welcome Message
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot REST API";
    }

    // 2. Addition
    public int add(int a, int b) {
        return a + b;
    }

    // 3. Even or Odd
    public String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    // 4. Age Category
    public String getAgeCategory(int age) {
        if (age < 18) {
            return "Child";
        } else if (age <= 59) {
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }

    // 5. Grade Calculation
    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
