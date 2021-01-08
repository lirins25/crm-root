package com.lirins.cn.service;

import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;

import java.util.List;

public interface SaleOrderReceiveService extends BaseService<SaleOrderReceive,Long> {
    PageVo<SaleOrderReceive> findWithOrderGood();
}
