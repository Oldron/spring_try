package com.example.spring_try.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage(Map<String, Object> model) {
        return "main";
    }
}
