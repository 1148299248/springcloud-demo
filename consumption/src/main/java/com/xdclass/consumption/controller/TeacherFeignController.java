package com.xdclass.consumption.controller;

import com.xdclass.consumption.impl.TeacherFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TeacherFeignController {
    @Autowired
    TeacherFeign teacherFeign;
    @RequestMapping("/list")
    public List list(){
        System.out.println();
        return teacherFeign.list();
    }
    @RequestMapping("/listId")
    public Object listId(@RequestParam("id") Integer id){
        return teacherFeign.listId(id);
    }
}
