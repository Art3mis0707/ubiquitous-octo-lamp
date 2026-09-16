package com.oracle.user;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/")
    public String getMapping(){
        return "User is running";
    }

    @GetMapping("/{id}")
    public String getPathVariable(@PathVariable String id){
        return id;
    }

}
