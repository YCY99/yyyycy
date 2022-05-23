package com.example.ycy.controller;

import com.example.ycy.dao.ptdao;
import com.example.ycy.pojo.pt;
import com.example.ycy.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

    @Controller
    public class ptcontroller {
        @Autowired
        ptdao pp;

        @RequestMapping("/message")
        public String msg(Model model){
            Collection<pt> pts=pp.getall();
            model.addAttribute("ms",pts);
            return "student";
        }
        @RequestMapping("/msg")
        public String mm(Model model){
            Collection<student>pt=pp.getstudent();
            model.addAttribute("mst",pt);
            return "stu";
        }
    }
