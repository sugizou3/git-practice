package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
    @GetMapping("/input")
    public String showForm() {
        return "input"; // input.htmlを呼び出す
    }
}