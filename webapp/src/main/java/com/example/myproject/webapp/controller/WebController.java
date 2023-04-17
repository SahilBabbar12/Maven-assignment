package com.example.myproject.webapp.controller;

import com.example.myproject.webapp.Service.WebAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @Autowired
    private WebAppService service;

    @RequestMapping("/web-app")
    @ResponseBody
    public String printHelloWorld(){
        return service.getMessage();
    }
}
