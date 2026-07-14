package com.example.userservice.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;


@Service
public class UserService {


    private final UserRepository repository;


    public UserService(UserRepository repository){

        this.repository=repository;

    }


    public List<User> getUsers(){

        return repository.findAll();

    }


    public User saveUser(User user){

        return repository.save(user);

    }


    public User getUser(Long id){

        return repository.findById(id).orElse(null);

    }

}