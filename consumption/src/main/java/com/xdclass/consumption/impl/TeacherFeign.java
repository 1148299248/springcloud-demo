package com.xdclass.consumption.impl;

import com.xdclass.consumption.hystrix.Fallbaek;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "DEMO1",fallbackFactory = Fallbaek.class)
public interface TeacherFeign {
    @RequestMapping("teacher/list")
    public List list();
    @RequestMapping("teacher/listId")
    public Object listId(@RequestParam("id") Integer id);

}
