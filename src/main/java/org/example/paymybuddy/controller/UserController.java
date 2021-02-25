package org.example.paymybuddy.controller;

import org.example.paymybuddy.model.User;
import org.example.paymybuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/testCreate")
    public User create_user(@RequestBody User new_user) {
        return userService.create(new_user);
    }
}
