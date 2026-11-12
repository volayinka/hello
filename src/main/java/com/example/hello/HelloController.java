package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "Viola") String name) {
        return "Hello, " + name + "! It's a great day!";
    }
}
