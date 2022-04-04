package com.maingroup.SpringBootProjects.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HTTPMethod {

    @GetMapping("/hello")
    public String getCustomMessage(){
        return "I love Vicky!";
    }
}
