package com.cli.vue.controller;

import com.cli.vue.domain.User;
import com.cli.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(methods = {RequestMethod.DELETE,RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT})
@RestController
public class UserController {
    @Autowired
    UserService service;

    private List<User> findAll(){
        return service.findAllUser();
    }

    @GetMapping("/user/{page}/{limit}")
    public Map<String,Object> findRange(@PathVariable("page") int page, @PathVariable("limit") int limit){
        Map<String,Object> map = new HashMap<>();
        int total = service.findAllUser().size();
        map.put("total",total);
        map.put("count",limit);
        map.put("page",total%limit == 0? total%limit : total/limit+1);
        map.put("users",service.findRange(page,limit));
        return map;
    }
    @GetMapping("/user/{id}")
    public User findOne(@PathVariable("id") String id){

        return service.findOne(id);
    }
    @PostMapping("/user")
    public Map<String,Object> saveUser(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        int count = service.addUser(user);
        if (count>0){
            map.put("success",true);
            map.put("user",user);
        }else {
            map.put("success",false);
            map.put("errorMessage","添加用户失败");
        }
        return map;
    }
    @DeleteMapping("/user/{id}")
    public Map<String,Object> deleteUser(@PathVariable("id") String id){
        Map<String,Object> map = new HashMap<>();
        int count = service.deleteUser(id);
        if (count>0){
            map.put("success",true);
        }else {
            map.put("success",false);
            map.put("errorMessage","删除用户失败");
        }
        return map;
    }
    @PutMapping("/user")
    public Map<String,Object> updateUser(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        int count = service.updateUser(user);
        if (count>0){
            map.put("success",true);
        }else {
            map.put("success",false);
            map.put("errorMessage","更新用户失败");
        }
        return map;
    }
}
