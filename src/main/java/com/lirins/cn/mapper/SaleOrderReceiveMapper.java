package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.entity.SaleOrderReceiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderReceiveMapper {
    long countByExample(SaleOrderReceiveExample example);

    int deleteByExample(SaleOrderReceiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleOrderReceive record);

    int insertSelective(SaleOrderReceive record);

    List<SaleOrderReceive> selectByExample(SaleOrderReceiveExample example);

    SaleOrderReceive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleOrderReceive record, @Param("example") SaleOrderReceiveExample example);

    int updateByExample(@Param("record") SaleOrderReceive record, @Param("example") SaleOrderReceiveExample example);

    int updateByPrimaryKeySelective(SaleOrderReceive record);

    int updateByPrimaryKey(SaleOrderReceive record);
}