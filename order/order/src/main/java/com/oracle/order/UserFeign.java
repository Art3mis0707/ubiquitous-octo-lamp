package com.oracle.order;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "USER")
public interface UserFeign {
    @GetMapping("/")
    public String getUser();

}
