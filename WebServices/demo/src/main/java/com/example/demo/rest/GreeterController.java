package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/api/greet/list")
    public List<Greeting> listGreetings() {
        List<Greeting> greetings = new ArrayList<>();
        greetings.add(new Greeting("Hello"));
        greetings.add(new Greeting("Hai"));
        greetings.add(new Greeting("welcome"));
        greetings.add(new Greeting("welcome"));
        greetings.add(new Greeting("bye"));
        return greetings;
    }

    //post request
    @PostMapping("/api/greet")
    public String save(@RequestBody Greeting greeting) {
        System.out.println(greeting);
        return "saved";
    }

    //dynamic url  /api/greet/john => Hello John
    @GetMapping("/api/greet/{name}/{salary}") // {} place holder, here name is replaced with value
    public Greeting findByName(@PathVariable String name, @PathVariable double salary) {
        return new Greeting("Hello " + name);
    }

    //update
    @PutMapping("/api/greet")
    public String updateGreet() {
        return "Updated";
    }

    //delete
    @DeleteMapping("/api/greet")
    public String removeGreet() {
        return "Deleted";
    }


}
