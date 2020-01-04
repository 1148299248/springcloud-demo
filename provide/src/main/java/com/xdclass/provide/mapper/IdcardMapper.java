package com.xdclass.provide.mapper;

import com.xdclass.provide.pojo.Idcard;
import com.xdclass.provide.pojo.IdcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdcardMapper {
    long countByExample(IdcardExample example);

    int deleteByExample(IdcardExample example);

    int deleteByPrimaryKey(String stid);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    List<Idcard> selectByExample(IdcardExample example);

    Idcard selectByPrimaryKey(String stid);

    int updateByExampleSelective(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByExample(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}