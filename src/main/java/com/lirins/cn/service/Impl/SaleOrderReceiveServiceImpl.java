package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Category;
import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.mapper.CategoryMapper;
import com.lirins.cn.mapper.SaleOrderReceiveMapper;
import com.lirins.cn.service.CategoryService;
import com.lirins.cn.service.SaleOrderReceiveService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 0.1
 * @ClassName:BrandServiceImpl
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Service
@Transactional
public class SaleOrderReceiveServiceImpl extends BaseServiceImpl<SaleOrderReceive,Long> implements SaleOrderReceiveService {
    @Autowired
    private SaleOrderReceiveMapper receiveMapper;

    @Override
    public PageVo<SaleOrderReceive> findWithOrderGood() {
        return setPageVoWithMultilist(receiveMapper.selectByExampleWithOrderGood(null));
    }

}
