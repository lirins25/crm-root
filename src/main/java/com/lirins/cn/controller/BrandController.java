package com.lirins.cn.controller;

import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 0.1
 * @ClassName:BrandController
 * @Description:
 * @date: 2021/1/1
 * @since JDK 1.8
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,String> {


}
