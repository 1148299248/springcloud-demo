package com.xdclass.provide.mapper;

import com.xdclass.provide.pojo.Testinformation;
import com.xdclass.provide.pojo.TestinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestinformationMapper {
    long countByExample(TestinformationExample example);

    int deleteByExample(TestinformationExample example);

    int deleteByPrimaryKey(Integer tmid);

    int insert(Testinformation record);

    int insertSelective(Testinformation record);

    List<Testinformation> selectByExample(TestinformationExample example);

    Testinformation selectByPrimaryKey(Integer tmid);

    int updateByExampleSelective(@Param("record") Testinformation record, @Param("example") TestinformationExample example);

    int updateByExample(@Param("record") Testinformation record, @Param("example") TestinformationExample example);

    int updateByPrimaryKeySelective(Testinformation record);

    int updateByPrimaryKey(Testinformation record);
}