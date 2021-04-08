package com.uxteam.security;

import com.uxteam.security.dao.PermissionDao;
import com.uxteam.security.dao.UserDao;
import com.uxteam.security.model.Permission;
import com.uxteam.security.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Security01ApplicationTests {
    @Autowired
    UserDao userDao;
    @Autowired
    PermissionDao permissionDao;
    @Test
    void contextLoads() {
        User user = userDao.findUserByName("zhangsan");
        List<String> permissions = permissionDao.getPermissionByUserId(user.getId());
        System.out.println(user);
        for (String permission:permissions){
            System.out.println(permission.toString());
        }
    }
}
