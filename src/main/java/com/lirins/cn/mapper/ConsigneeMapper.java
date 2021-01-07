package com.lirins.cn.mapper;

import com.lirins.cn.entity.Consignee;
import com.lirins.cn.entity.ConsigneeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsigneeMapper {
    long countByExample(ConsigneeExample example);

    int deleteByExample(ConsigneeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    List<Consignee> selectByExample(ConsigneeExample example);

    Consignee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByExample(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);
}