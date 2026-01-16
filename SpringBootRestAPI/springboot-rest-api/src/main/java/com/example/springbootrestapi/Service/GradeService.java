package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class GradeService {

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
