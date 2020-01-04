package com.xdclass.provide.mapper;

import com.xdclass.provide.pojo.Subjectinformation;
import com.xdclass.provide.pojo.SubjectinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectinformationMapper {
    long countByExample(SubjectinformationExample example);

    int deleteByExample(SubjectinformationExample example);

    int deleteByPrimaryKey(Integer subid);

    int insert(Subjectinformation record);

    int insertSelective(Subjectinformation record);

    List<Subjectinformation> selectByExample(SubjectinformationExample example);

    Subjectinformation selectByPrimaryKey(Integer subid);

    int updateByExampleSelective(@Param("record") Subjectinformation record, @Param("example") SubjectinformationExample example);

    int updateByExample(@Param("record") Subjectinformation record, @Param("example") SubjectinformationExample example);

    int updateByPrimaryKeySelective(Subjectinformation record);

    int updateByPrimaryKey(Subjectinformation record);
}