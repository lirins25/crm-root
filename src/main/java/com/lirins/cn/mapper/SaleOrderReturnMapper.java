package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleOrderReturn;
import com.lirins.cn.entity.SaleOrderReturnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderReturnMapper {
    long countByExample(SaleOrderReturnExample example);

    int deleteByExample(SaleOrderReturnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleOrderReturn record);

    int insertSelective(SaleOrderReturn record);

    List<SaleOrderReturn> selectByExample(SaleOrderReturnExample example);

    SaleOrderReturn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleOrderReturn record, @Param("example") SaleOrderReturnExample example);

    int updateByExample(@Param("record") SaleOrderReturn record, @Param("example") SaleOrderReturnExample example);

    int updateByPrimaryKeySelective(SaleOrderReturn record);

    int updateByPrimaryKey(SaleOrderReturn record);
}