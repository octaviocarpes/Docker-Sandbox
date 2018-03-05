package com.example.docker.spring.demodockerspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDockerController {


    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "Home Page!";
    }


}
