package com.example.springbootfirstdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @RequestMapping("users")
    public String users(){
        return "users";
    }
}
