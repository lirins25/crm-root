package com.lirins.cn.service;

import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.dto.GoodSelectDto;
import com.lirins.cn.entity.Brand;
import com.lirins.cn.entity.Good;
import com.lirins.cn.service.base.BaseService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @version 0.1
 * @ClassName:BrandService
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
public interface GoodService extends BaseService<Good,Long> {
    String upload(HttpServletRequest request);

    List<Good> selectByExample(GoodSelectDto goodSelectDto);

}
