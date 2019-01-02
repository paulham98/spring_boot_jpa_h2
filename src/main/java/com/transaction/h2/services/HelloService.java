package com.transaction.h2.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("hello.world")
    private String world;

    public String getHello() {
        return "profile hello.world:"+world;
    }
}
