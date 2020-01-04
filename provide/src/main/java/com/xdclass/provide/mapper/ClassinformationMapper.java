package com.xdclass.provide.mapper;

import com.xdclass.provide.pojo.Classinformation;
import com.xdclass.provide.pojo.ClassinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassinformationMapper {
    long countByExample(ClassinformationExample example);

    int deleteByExample(ClassinformationExample example);

    int deleteByPrimaryKey(String clid);

    int insert(Classinformation record);

    int insertSelective(Classinformation record);

    List<Classinformation> selectByExample(ClassinformationExample example);

    Classinformation selectByPrimaryKey(String clid);

    int updateByExampleSelective(@Param("record") Classinformation record, @Param("example") ClassinformationExample example);

    int updateByExample(@Param("record") Classinformation record, @Param("example") ClassinformationExample example);

    int updateByPrimaryKeySelective(Classinformation record);

    int updateByPrimaryKey(Classinformation record);
}