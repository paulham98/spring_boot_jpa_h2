package com.transaction.h2;

import com.transaction.h2.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void user() {
        String url = "/api/v1/user/";
        ResponseEntity<User> responseUser = this.testRestTemplate.getForEntity(url, User.class );
        System.out.println(responseUser.getStatusCode());
    }
    @Test
    public void hello() {
        String url = "/api/v1/user/";
        ResponseEntity<String> responseUser = this.testRestTemplate.getForEntity(url, String.class );
        System.out.println(responseUser.getStatusCode());
    }
}
