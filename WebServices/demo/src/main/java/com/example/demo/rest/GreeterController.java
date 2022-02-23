package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    //This method to be called by the client using GET method
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello Rest";
    }

    @GetMapping("/api/greet")
    public Greeting sayGreet() {
        return new Greeting("Greet");
    }

}
