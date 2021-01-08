package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Consignee;
import com.lirins.cn.service.ConsigneeService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import com.lirins.cn.vo.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:ConsigneeServiceImpl
 * @Description:
 * @date: 2021/1/7
 * @since JDK 1.8
 */
@Service
@Transactional
public class ConsigneeServiceImpl extends BaseServiceImpl<Consignee,Long> implements ConsigneeService {

}
