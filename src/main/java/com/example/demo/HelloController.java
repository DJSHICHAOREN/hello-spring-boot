package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/say"})
public class HelloController {

    @Autowired
    private SupermanProperties supermanProperties;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String say(@RequestParam(value="name", defaultValue = "lwd") String myName){
        return "name:" + myName;
    }
}
