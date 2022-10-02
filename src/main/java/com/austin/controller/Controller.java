package com.austin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller + (method) @ResponseBody
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello!!!";
    }
}
