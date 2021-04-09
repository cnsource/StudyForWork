package com.cli.vue.service;

import com.cli.vue.dao.UserDao;
import com.cli.vue.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserService implements IUserService{
    @Autowired
    UserDao dao;
    @Override
    public User findOne(String id) {
        return dao.findOne(id);
    }

    @Override
    public List<User> findAllUser() {
        return dao.findAllUser();
    }

    @Override
    public List<User> findRange(int page,int limit) {
        return dao.findRange(page-1,limit);
    }

    @Override
    public int addUser(User user) {
        user.setId(UUID.randomUUID().toString().split("-")[0]);
        System.out.println(user.getId());
        return dao.addUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return dao.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return dao.updateUser(user);
    }
}
