package com.xdclass.provide.controller;

import com.xdclass.provide.pojo.Teacher;
import com.xdclass.provide.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @Value("${server.port}")
    private static String po;

    @RequestMapping("/list")
    public List list(){
        List list = teacherService.list();
        return list;
    }
    @RequestMapping("/add")
    public boolean add(Teacher t){
        return teacherService.add(t);
    }
    @RequestMapping("/delete")
    public boolean dele(Integer id){
        return teacherService.delete(id);
    }
    @RequestMapping("/listId")
    public Object id(Integer id){
        return teacherService.listId(id);
    }
}
