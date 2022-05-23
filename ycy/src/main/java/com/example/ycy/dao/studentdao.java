package com.example.ycy.dao;

import com.example.ycy.pojo.student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class studentdao {
    public static Map<Integer, student> stu=null;
    static {
        stu=new HashMap<Integer,student>();//创建学生表
        stu.put(001,new student(001,"杨昌元","物联2161",18,1,216101));
        stu.put(002,new student(002,"吴钊越","物联2162",21,1,216202));
        stu.put(003,new student(003,"施嘉辉","物联2161",30,1,216102));
        stu.put(004,new student(004,"严小龙","物联2161",45,1,216103));
    }
    private static Integer InitID=005;
    //增加学生
    public void zen(student st){
        if (st.getId()==null){
            st.setId(InitID++);
        }
        stu.put(st.getId(),st);
    }
    //删除
    public void delete(Integer id){
        stu.remove(id);
    }
    //得到学生信息
    public Collection<student>getstudent(){
        return stu.values();
    }
    //通过ID查找信息
    public student get(Integer id){
        return stu.get(id);
    }
    //通过姓名查找信息
    public student getID(String name){
        return stu.get(name);
    }
}
