package com.oracle.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    private final UserFeign userFeign;

    public Controller(UserFeign userFeign) {
        this.userFeign = userFeign;
    }

    @GetMapping("/")
    public String status(){
        String data = userFeign.getUser();
        return "Order is running "+data ;
    }

    @GetMapping("/{id}")
    public String getPathVariable(@PathVariable String id){
        String data = userFeign.getUser();
        return id + " " + data;
    }
}
