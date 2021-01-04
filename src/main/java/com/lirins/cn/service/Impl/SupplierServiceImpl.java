package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Category;
import com.lirins.cn.entity.Supplier;
import com.lirins.cn.service.CategoryService;
import com.lirins.cn.service.SupplierService;
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
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {
}
