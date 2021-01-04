package com.lirins.cn.controller;

import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,String> {

}
