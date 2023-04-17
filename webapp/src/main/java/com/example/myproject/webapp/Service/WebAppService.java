package com.example.myproject.webapp.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WebAppService {

    public String getMessage(){
        return "Hello, world!";
    }
}
