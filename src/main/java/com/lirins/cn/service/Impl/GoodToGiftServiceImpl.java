package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Good;
import com.lirins.cn.entity.GoodToGift;
import com.lirins.cn.service.GoodService;
import com.lirins.cn.service.GoodToGiftService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 0.1
 * @ClassName:BrandServiceImpl
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Service
@Transactional
public class GoodToGiftServiceImpl extends BaseServiceImpl<GoodToGift,Long> implements GoodToGiftService {
}
