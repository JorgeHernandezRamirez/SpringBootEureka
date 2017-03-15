package com.jorgehernandezramirez.spring.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SPRINGCLOUDWEBTEST")
public interface TestFeign {

    @RequestMapping(value="/ping", method = RequestMethod.GET)
    String doAlive();
}
