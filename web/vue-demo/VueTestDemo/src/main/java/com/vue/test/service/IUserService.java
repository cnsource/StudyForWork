package com.vue.test.service;

import com.vue.test.domain.User;
import java.util.List;

public interface IUserService {
    /**
     * 查询所有用户
     */
    List<User> findAll();
    int addUser(User user);
    int deleteUser(String id);
    User findOne(String id);
    int updateUser(User user);
    List<User> findUserByNameOrPhone(String name,String phone);
}
