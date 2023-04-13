package com.example.myproject.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping("/home")
    @ResponseBody
    public String printHelloWorld(){
        return "Hello World";
    }
}
