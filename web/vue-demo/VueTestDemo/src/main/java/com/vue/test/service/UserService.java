package com.vue.test.service;

import com.vue.test.dao.UserDao;
import com.vue.test.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements IUserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int addUser(User user) {
        user.setId(UUID.randomUUID().toString().split("-")[0]);
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User findOne(String id) {
        return userDao.findOne(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public List<User> findUserByNameOrPhone(String name, String phone) {
        return userDao.findUserByNameOrPhone(name,phone);
    }
}
