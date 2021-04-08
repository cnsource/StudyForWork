package com.vue.test.controller;

import com.vue.test.domain.User;
import com.vue.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.GET})
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/all")
    public List<User> alluser(){
        System.out.println("UserAll");
        return userService.findAll();
    }
    @PostMapping ("/save")
    public Map<String, Object> adduser(@RequestBody User user){
        System.out.println("addUser"+user.toString());
        Map<String,Object> map = new HashMap<>();
        int count = 0;
        boolean status = true;
        if(user.getId()!=null){
            try {
                count = userService.updateUser(user);
            } catch (Exception e) {
                status = false;
                e.printStackTrace();
            }
        }else{
            try {
                count = userService.addUser(user);
            } catch (Exception e) {
                status = false;
                map.put("error","用户保存失败"+e.getMessage());
                e.printStackTrace();
            }
        }
        map.put("success",true);
        map.put("count",count);
        return map;
    }
    @DeleteMapping("/delete/{id}")
    public Map<String, Object> deleteUser(@PathVariable("id") String id){
        System.out.println("deleteUser"+id);
        Map<String,Object> map = new HashMap<>();
        try {
            int count = userService.deleteUser(id);
            map.put("success",true);
            map.put("count",count);
        } catch (Exception e) {
            map.put("success",false);
            map.put("error","删除用户失败"+e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
    @GetMapping("/one")
    public User getUser(String id){
        System.out.println(id);
        User one = userService.findOne(id);
        System.out.println(one);
        return one;
    }
    @GetMapping("/serch")
    public List<User> getUser(@RequestParam("name") String name,@RequestParam("phone") String phone){
        System.out.println(name+"-"+phone);
        List<User> users = userService.findUserByNameOrPhone(name,phone);
        return users;
    }
}
