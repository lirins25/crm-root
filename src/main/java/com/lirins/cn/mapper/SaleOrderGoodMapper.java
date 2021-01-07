package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleOrderGood;
import com.lirins.cn.entity.SaleOrderGoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderGoodMapper {
    long countByExample(SaleOrderGoodExample example);

    int deleteByExample(SaleOrderGoodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleOrderGood record);

    int insertSelective(SaleOrderGood record);

    List<SaleOrderGood> selectByExample(SaleOrderGoodExample example);

    SaleOrderGood selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleOrderGood record, @Param("example") SaleOrderGoodExample example);

    int updateByExample(@Param("record") SaleOrderGood record, @Param("example") SaleOrderGoodExample example);

    int updateByPrimaryKeySelective(SaleOrderGood record);

    int updateByPrimaryKey(SaleOrderGood record);
}