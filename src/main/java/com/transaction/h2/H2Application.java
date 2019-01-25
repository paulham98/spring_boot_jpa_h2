package com.transaction.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableCaching
public class H2Application extends SpringBootServletInitializer {



    @RequestMapping
    public String home(){
        return "Hello Docker World";

    }

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }



}
