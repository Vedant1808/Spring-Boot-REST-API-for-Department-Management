package com.dailycodebuffer.Springboot.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String message;

    @GetMapping(value="/")
    public String helloWorld()
    {
        return message;
    }

}
