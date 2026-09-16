package com.oracle.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/gateway")
    public String getUser(){
        return "gateway is running";
    }
}