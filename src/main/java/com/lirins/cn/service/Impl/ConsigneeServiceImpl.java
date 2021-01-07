package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Consignee;
import com.lirins.cn.mapper.ConsigneeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:ConsigneeServiceImpl
 * @Description:
 * @date: 2021/1/7
 * @since JDK 1.8
 */
@Service
public class ConsigneeServiceImpl {
    @Autowired
    private ConsigneeMapper mapper;

    public List<Consignee> findAll(){
        return mapper.selectByExample(null);
    }
}
