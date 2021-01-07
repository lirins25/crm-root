package com.lirins.cn.controller;

import com.lirins.cn.service.ConsigneeService;
import com.lirins.cn.service.Impl.ConsigneeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 0.1
 * @ClassName:ConsigneeController
 * @Description:
 * @date: 2021/1/7
 * @since JDK 1.8
 */
@RequestMapping("consignee")
@RestController
public class ConsigneeController {
    @Autowired
    private ConsigneeServiceImpl service;
    @GetMapping
    public String findAll(){
        System.out.println(service.findAll());
        return "ok";
    }

}
