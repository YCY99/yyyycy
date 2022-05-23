package com.example.ycy.controller;

import com.example.ycy.dao.userdao;
import com.example.ycy.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    userdao use;

    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password, Model model, HttpSession session){
        user a=new user(username,password);
        if (use.login(a)==a){
            session.setAttribute("ycy",username);
            return "home";
        }
        else {
            System.out.println(username+" "+password);
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
}
