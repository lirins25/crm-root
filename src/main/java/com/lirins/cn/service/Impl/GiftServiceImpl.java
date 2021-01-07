package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Gift;
import com.lirins.cn.service.GiftService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GiftServiceImpl extends BaseServiceImpl<Gift, Long> implements GiftService {

}
