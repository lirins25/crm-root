package com.lirins.cn.mapper;

import com.lirins.cn.entity.GiftToGood;
import com.lirins.cn.entity.GiftToGoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftToGoodMapper {
    long countByExample(GiftToGoodExample example);

    int deleteByExample(GiftToGoodExample example);

    int deleteByPrimaryKey(Long giftToGoodId);

    int insert(GiftToGood record);

    int insertSelective(GiftToGood record);

    List<GiftToGood> selectByExample(GiftToGoodExample example);

    GiftToGood selectByPrimaryKey(Long giftToGoodId);

    int updateByExampleSelective(@Param("record") GiftToGood record, @Param("example") GiftToGoodExample example);

    int updateByExample(@Param("record") GiftToGood record, @Param("example") GiftToGoodExample example);

    int updateByPrimaryKeySelective(GiftToGood record);

    int updateByPrimaryKey(GiftToGood record);
}