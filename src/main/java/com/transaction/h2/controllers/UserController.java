package com.transaction.h2.controllers;

import com.transaction.h2.domain.User;
import com.transaction.h2.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private HelloService helloService;

    @Autowired
    public UserController(HelloService helloservice) {
        this.helloService = helloservice;
    }

    @GetMapping(value = "api/v1/user")
    public User  getUser() {
        User user = new User();
        user.setName("jungho");
        return user;
    }

    @GetMapping(value = "api/v1/hello")
        public String getHello() {
            return this.helloService.getHello();
    }


}
