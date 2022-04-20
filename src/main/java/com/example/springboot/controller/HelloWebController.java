package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String Hello() {
        return "Hello";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a coustom message. Hello from Bridgelabz");
        return "Message";
    }
}
