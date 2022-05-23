package com.example.ycy.controller;

import com.example.ycy.dao.ptdao;
import com.example.ycy.dao.studentdao;
import com.example.ycy.pojo.pt;
import com.example.ycy.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeController {
    @Autowired
    ptdao pp;
    @Autowired
    studentdao std;

    @PostMapping("/add")
    public String add(Integer id, @RequestParam("name")String name, @RequestParam("classname")String classname, @RequestParam("sex")int sex, @RequestParam("age")int age, @RequestParam("place")String place, @RequestParam("time")String time,@RequestParam("sid")Integer sid){
        pp.zz(new pt(id,place,time,name));
        std.zen(new student(id,name,classname,age,sex,sid));
        return "redirect:/message";
    }
    @PostMapping("/add2")
    public String add2(Integer id, @RequestParam("name")String name, @RequestParam("classname")String classname, @RequestParam("sex")int sex, @RequestParam("age")int age, @RequestParam("place")String place, @RequestParam("time")String time,@RequestParam("sid")Integer sid){
        pp.zz(new pt(id,place,time,name));
        std.zen(new student(id,name,classname,age,sex,sid));
        return "redirect:/msg";
    }
    @GetMapping("/delete/{ID}")
    public String delete(@PathVariable("ID")Integer id){
        pp.delete(id);
        std.delete(id);
        return "redirect:/message";
    }
    @GetMapping("/delete2/{ID}")
    public String delete2(@PathVariable("ID")Integer id){
        pp.delete(id);
        std.delete(id);
        return "redirect:/msg";
    }
    @GetMapping("/xiugai/{ID}")
    public String xiu(@PathVariable("ID")Integer id, Model model){
        pt p=pp.getfromid(id);
        model.addAttribute("msg",p);
        student st=std.get(id);
        model.addAttribute("mst",st);
        return "xiu";
    }
    @GetMapping("/xiugai2/{ID}")
    public String xiu2(@PathVariable("ID")Integer id, Model model){
        pt p=pp.getfromid(id);
        model.addAttribute("msg",p);
        student st=std.get(id);
        model.addAttribute("mst",st);
        return "xiu2";
    }
    @PostMapping("/update")
    public String update(Integer id,@RequestParam("name")String name,@RequestParam("classname")String classname,@RequestParam("sex")int sex,@RequestParam("age")int age,@RequestParam("place")String place,@RequestParam("time")String time,@RequestParam("sid")Integer sid){
        pp.zz(new pt(id,place,time,name));
        std.zen(new student(id,name,classname,age,sex,sid));
        return "redirect:/message";
    }
    @PostMapping("/update2")
    public String update2(Integer id,@RequestParam("name")String name,@RequestParam("classname")String classname,@RequestParam("sex")int sex,@RequestParam("age")int age,@RequestParam("place")String place,@RequestParam("time")String time,@RequestParam("sid")Integer sid){
        pp.zz(new pt(id,place,time,name));
        std.zen(new student(id,name,classname,age,sex,sid));
        return "redirect:/msg";
    }
}
