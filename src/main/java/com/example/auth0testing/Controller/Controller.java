package com.example.auth0testing.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/testGet")
    public String getTest(){
        return "Hello world get";
    }

    @PostMapping("/testPost")
    public String getPost(){
        return "Hello world post";
    }
}
