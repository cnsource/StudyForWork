package com.vue.test;

import com.vue.test.dao.UserDao;
import com.vue.test.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {
        List<User> all = userDao.findAll();
        System.out.println(all.toString());
    }

}
