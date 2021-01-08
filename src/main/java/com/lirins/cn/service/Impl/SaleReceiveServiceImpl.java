package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.mapper.SaleOrderReceiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 0.1
 * @ClassName:SleReceiveServiceImpl
 * @Description:
 * @date: 2021/1/8
 * @since JDK 1.8
 */
@Service
public class SaleReceiveServiceImpl {
    @Autowired
    private SaleOrderReceiveMapper mapper;
    public void findAll(){
        System.out.println(mapper.selectByExample(null));
    }
}
