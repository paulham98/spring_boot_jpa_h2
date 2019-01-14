package com.transaction.h2.services;

import com.transaction.h2.domain.User;
import com.transaction.h2.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    
    @Autowired
    private HelloService helloService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUsers() {
        User user = new User();
        user.setId(123);
        user.setName("jungho");
        user.setPassword("1234");
        userRepository.save(user);


        List<User> users = helloService.getUsers();
        System.out.printf("usersSize:%d \n", users.size());
        assertEquals(1, users.size());

        System.out.println(helloService.getUsers());
        System.out.println(helloService.getUsers());
        System.out.println(helloService.getUsers());


    }
}