package com.lirins.cn.mapper;

import com.lirins.cn.entity.GoodToGift;
import com.lirins.cn.entity.GoodToGiftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodToGiftMapper {
    long countByExample(GoodToGiftExample example);

    int deleteByExample(GoodToGiftExample example);

    int deleteByPrimaryKey(Long goodToGiftId);

    int insert(GoodToGift record);

    int insertSelective(GoodToGift record);

    List<GoodToGift> selectByExample(GoodToGiftExample example);

    GoodToGift selectByPrimaryKey(Long goodToGiftId);

    int updateByExampleSelective(@Param("record") GoodToGift record, @Param("example") GoodToGiftExample example);

    int updateByExample(@Param("record") GoodToGift record, @Param("example") GoodToGiftExample example);

    int updateByPrimaryKeySelective(GoodToGift record);

    int updateByPrimaryKey(GoodToGift record);
}