package com.lirong.nacosconsumer.controller;

import com.lirong.nacosconsumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private ProviderFeign providerFeign;

    @RequestMapping("hi")
    public String hi() {
        return "hi=="+providerFeign.hello();
    }
}
