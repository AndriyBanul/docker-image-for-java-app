package com.docker.deployed.controller;

import com.docker.deployed.config.AppProperties;
import com.docker.deployed.config.DBConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class HelloController {

    /*@Value("${mail.myName:some default}")
    private String firstName;*/

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private DBConfig dbConfig;

    @GetMapping("/")
    public String returnHollo(){
        return "Hello there and hi. My Name is" + appProperties.getHost();
    }

    @GetMapping("/db")
    public String returnHost(){
        return "DB host is " + dbConfig.getHost();
    }

}
