

package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class AgeCategoryService {

    public String getAgeCategory(int age) {

        if (age < 18) {
            return "Child";
        } else if (age >= 18 && age <= 59) {
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }
}
