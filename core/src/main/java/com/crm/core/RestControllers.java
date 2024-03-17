package com.crm.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
    @GetMapping("/add")
    public String add(){
        System.out.println("Add");
        return "Welcome Add";
    }
    @GetMapping("/")
    public String get(){
        return "Welcome get";
    }
    
}
