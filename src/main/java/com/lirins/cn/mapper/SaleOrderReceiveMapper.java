package com.lirins.cn.mapper;

import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.mapper.base.BaseMapper;

import java.util.List;

public interface SaleOrderReceiveMapper extends BaseMapper<SaleOrderReceive,Long> {

   List<SaleOrderReceive> selectByExampleWithOrderGood(Object example);
}