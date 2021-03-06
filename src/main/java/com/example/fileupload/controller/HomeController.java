package com.example.fileupload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHomePage() {
        return "This is the home page";
    }
    
    @PostMapping("/home/message")
    public String postHomePage() {
        System.out.println("test completed");
        return "message posted";
    }
}
