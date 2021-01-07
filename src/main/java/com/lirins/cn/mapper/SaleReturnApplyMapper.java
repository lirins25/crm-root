package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleReturnApply;
import com.lirins.cn.entity.SaleReturnApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleReturnApplyMapper {
    long countByExample(SaleReturnApplyExample example);

    int deleteByExample(SaleReturnApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleReturnApply record);

    int insertSelective(SaleReturnApply record);

    List<SaleReturnApply> selectByExample(SaleReturnApplyExample example);

    SaleReturnApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleReturnApply record, @Param("example") SaleReturnApplyExample example);

    int updateByExample(@Param("record") SaleReturnApply record, @Param("example") SaleReturnApplyExample example);

    int updateByPrimaryKeySelective(SaleReturnApply record);

    int updateByPrimaryKey(SaleReturnApply record);
}