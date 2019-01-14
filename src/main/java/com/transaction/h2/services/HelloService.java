package com.transaction.h2.services;

import com.transaction.h2.domain.User;
import com.transaction.h2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {


    private UserRepository userRepository;

    @Autowired
    public HelloService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Value("hello.world")
    private String world;

    public String getHello() {
        return "profile hello.world:"+world;
    }

    public List<User> getUsers() {
        List<User> user = userRepository.findAll();
        return user;
    }
}
