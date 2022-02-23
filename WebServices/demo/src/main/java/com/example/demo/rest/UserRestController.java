package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userRepository.findById(id)
                .map(newUser -> {
                    newUser.setEmail(user.getEmail());
                    return userRepository.save(newUser);
                }).orElseGet(() -> user);
    }

    //delete operation
    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}
