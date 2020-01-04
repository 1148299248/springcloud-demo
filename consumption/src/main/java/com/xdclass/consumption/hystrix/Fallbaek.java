package com.xdclass.consumption.hystrix;

import com.xdclass.consumption.impl.TeacherFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Fallbaek implements FallbackFactory<TeacherFeign> {
    @Override
    public TeacherFeign create(Throwable throwable) {
        return new TeacherFeign() {
            @Override
            public List list() {
                List li = new ArrayList();
                li.add("错误");
                return li;
            }

            @Override
            public Object listId(Integer id) {
                return "系统错误";
            }
        };
    }
}
