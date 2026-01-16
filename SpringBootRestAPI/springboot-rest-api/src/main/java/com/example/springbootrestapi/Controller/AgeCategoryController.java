package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.AgeCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCategoryController {

    private final AgeCategoryService ageCategoryService;

    public AgeCategoryController(AgeCategoryService ageCategoryService) {
        this.ageCategoryService = ageCategoryService;
    }

    @GetMapping("/age/{age}")
    public String getAgeCategory(@PathVariable int age) {
        return ageCategoryService.getAgeCategory(age);
    }
}
