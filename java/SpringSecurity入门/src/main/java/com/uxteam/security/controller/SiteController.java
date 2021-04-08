package com.uxteam.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/logsite")
    public String login() {
        return "/login";
    }
}
