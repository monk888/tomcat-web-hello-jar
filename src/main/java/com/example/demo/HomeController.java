package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @Value("${ip:ip}")
//    private String ip;
//    @Value("${port:port}")
//    private String port;
//    @Value("${serverName:serverName}")
//    private String serverName;
//    @Value("${chen:chen}")
//    private String chen;


    @RequestMapping("/test")
    public String apollo() {
        return "201907121632  what's your problem!";
    }
}
