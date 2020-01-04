package com.xdclass.provide.service;

import com.xdclass.provide.mapper.TeacherMapper;
import com.xdclass.provide.pojo.Teacher;
import com.xdclass.provide.pojo.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacher;
    @Value("${server.port}")
    private static String po;


    public List list(){
        TeacherExample example = new TeacherExample();
        return teacher.selectByExample(example);
    }

    public boolean add(Teacher t){
        return teacher.insert(t)==1;
    }
    public boolean delete(Integer id){
        return teacher.deleteByPrimaryKey(id)==1;
    }
    public Object listId(Integer id){
        System.out.println("8062");
        return teacher.selectByPrimaryKey(id);
    }

}
