package com.lirong.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${myName}")
    private String myName;

    @Value("${redisUrl}")
    private String redisUrl;

    @Value("${jdbcUrl}")
    private String jdbcUrl;

    @RequestMapping("hello")
    public String hello() {
        return "hello " + myName+"----"+redisUrl+"----"+jdbcUrl;
    }

}
