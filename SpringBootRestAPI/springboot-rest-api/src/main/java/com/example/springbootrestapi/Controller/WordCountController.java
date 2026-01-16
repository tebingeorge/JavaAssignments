package com.example.springbootrestapi.Controller;

import com.example.springbootrestapi.Service.WordCountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCountController {

    private final WordCountService service;

    public WordCountController(WordCountService service) {
        this.service = service;
    }

    @PostMapping("/wordcount")
    public int countWords(@RequestBody String text) {
        return service.countWords(text);
    }
}
