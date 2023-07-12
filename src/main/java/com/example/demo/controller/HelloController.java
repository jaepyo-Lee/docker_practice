package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@Value("${practice.name}") String hello){
        return hello;
    }
    @GetMapping("/hello/new")
    public String newHello(){
        return "재배포(feat.이게되네?)";
    }
}
