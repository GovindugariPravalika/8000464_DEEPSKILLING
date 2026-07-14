package com.example.userservice.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService service;


    public UserController(UserService service){

        this.service=service;

    }


    @GetMapping
    public List<User> getUsers(){

        return service.getUsers();

    }



    @PostMapping
    public User addUser(@RequestBody User user){

        return service.saveUser(user);

    }



    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){

        return service.getUser(id);

    }

}