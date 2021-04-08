package com.uxteam.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/vip/topic")
    @PreAuthorize("hasAuthority('v2')")
    public String vip() {
        System.out.println(getUserName());;
        System.out.println("访问了VIP资源");
        return "/vip/vtop1";
    }

    @RequestMapping("/nom/title")
    @PreAuthorize("hasAnyAuthority('v2','v1')")
    public String nom() {
        System.out.println(getUserName()+"访问了普通资源");;
        return "/nom/top1";
    }
    @RequestMapping("/any")
    public String any() {
        System.out.println(getUserName()+"访问了普通资源");;
        return "index";
    }
    private String getUserName() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal == null) {
            return "匿名";
        }

        String username = null;
        if (principal instanceof UserDetails) {
            UserDetails details = (UserDetails) principal;
            username = details.getUsername();
        } else {
            username = "未识别用户";
        }
        return username;
    }
}
