package com.transaction.h2.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getHello() {
        return "hello";
    }
}
