package com.example.UASJavaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("index")
    public String index(){
        return "index.html";
    };

    @RequestMapping("login")
    public String login(){
        return "login.html";
    };
    @RequestMapping("register")
    public String register(){
        return "register.html";
    };
    @RequestMapping("about_us")
    public String aboutus(){
        return "about_us.html";
    };
    @RequestMapping("download")
    public String download(){
        return "download.html";
    };
}
