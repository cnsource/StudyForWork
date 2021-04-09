package com.cli.vue;

import com.cli.vue.domain.User;
import com.cli.vue.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VuecliApplicationTests {
    @Autowired
    UserService service;
    @Test
    void contextLoads() {
        List<User> allUser = service.findRange(1, 10);
        System.out.println(allUser.size());
    }
}
