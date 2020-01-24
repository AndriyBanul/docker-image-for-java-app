package com.docker.deployed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String returnHollo(){
        return "Hello there and hi";
    }

}
