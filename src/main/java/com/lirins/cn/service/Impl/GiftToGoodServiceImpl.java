package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Gift;
import com.lirins.cn.entity.GiftToGood;
import com.lirins.cn.service.GiftToGoodService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GiftToGoodServiceImpl extends BaseServiceImpl<GiftToGood, Long> implements GiftToGoodService {
    
}
