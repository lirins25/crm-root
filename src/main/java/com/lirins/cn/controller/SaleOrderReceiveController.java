package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Consignee;
import com.lirins.cn.entity.SaleOrderReceive;
import com.lirins.cn.service.SaleOrderReceiveService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:SaleOrderReceiveController
 * @Description:
 * @date: 2021/1/8
 * @since JDK 1.8
 */
@RequestMapping("saleOrderReceive")
@RestController
public class SaleOrderReceiveController extends BaseController<SaleOrderReceive,Long> {
    @Autowired
    private SaleOrderReceiveService receiveService;

    @GetMapping
    public AxiosResult<PageVo<SaleOrderReceive>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<SaleOrderReceive> pageVo = receiveService.findWithOrderGood();
        return AxiosResult.success(pageVo);
    }

    @GetMapping("{id}")
    public AxiosResult<SaleOrderReceive> findById(@PathVariable Long id) {
        return AxiosResult.success(receiveService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody SaleOrderReceive entity) {
        int i = receiveService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody SaleOrderReceive entity) {
        int i = receiveService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = receiveService.batchDeleteByIds(ids);
        return toAxios(i);
    }

}
