package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.GradeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/grade/{marks}")
    public String getGrade(@PathVariable int marks) {
        return gradeService.calculateGrade(marks);
    }
}
