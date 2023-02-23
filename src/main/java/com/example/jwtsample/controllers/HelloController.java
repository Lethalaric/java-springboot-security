package com.example.jwtsample.controllers;

import com.example.jwtsample.services.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return helloService.hello();
    }
}
