package com.example.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getuser")
    public String getUser() {
        return "Hello, this is a simple response from /getuser route!";
    }
}
