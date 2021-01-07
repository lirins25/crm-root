package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleOrderOutbound;
import com.lirins.cn.entity.SaleOrderOutboundExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderOutboundMapper {
    long countByExample(SaleOrderOutboundExample example);

    int deleteByExample(SaleOrderOutboundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleOrderOutbound record);

    int insertSelective(SaleOrderOutbound record);

    List<SaleOrderOutbound> selectByExample(SaleOrderOutboundExample example);

    SaleOrderOutbound selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleOrderOutbound record, @Param("example") SaleOrderOutboundExample example);

    int updateByExample(@Param("record") SaleOrderOutbound record, @Param("example") SaleOrderOutboundExample example);

    int updateByPrimaryKeySelective(SaleOrderOutbound record);

    int updateByPrimaryKey(SaleOrderOutbound record);
}