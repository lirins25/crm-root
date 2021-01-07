package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Good;
import com.lirins.cn.entity.GoodToGift;
import com.lirins.cn.service.GoodService;
import com.lirins.cn.service.GoodToGiftService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodToGiftServiceImpl extends BaseServiceImpl<GoodToGift, Long> implements GoodToGiftService {

}
