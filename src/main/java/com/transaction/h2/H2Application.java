package com.transaction.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class H2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

}
