package com.cdq.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-provider")
public interface ProviderFeign {

    @RequestMapping("hello")
    public String hello();
}
