package com.xdclass.provide.mapper;

import com.xdclass.provide.pojo.StudentandsubjectExample;
import com.xdclass.provide.pojo.StudentandsubjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentandsubjectMapper {
    long countByExample(StudentandsubjectExample example);

    int deleteByExample(StudentandsubjectExample example);

    int deleteByPrimaryKey(StudentandsubjectKey key);

    int insert(StudentandsubjectKey record);

    int insertSelective(StudentandsubjectKey record);

    List<StudentandsubjectKey> selectByExample(StudentandsubjectExample example);

    int updateByExampleSelective(@Param("record") StudentandsubjectKey record, @Param("example") StudentandsubjectExample example);

    int updateByExample(@Param("record") StudentandsubjectKey record, @Param("example") StudentandsubjectExample example);
}