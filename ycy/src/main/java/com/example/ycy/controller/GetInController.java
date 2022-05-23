package com.example.ycy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetInController {
    @GetMapping("/stu")
    public String stu(){
        return "student";
    }
    @GetMapping("/ma")
    public String map(){
        return "baidu";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/info")
    public String info(){
        return "add";
    }
    @GetMapping("/info2")
    public String info2(){
        return "add2";
    }
    }
