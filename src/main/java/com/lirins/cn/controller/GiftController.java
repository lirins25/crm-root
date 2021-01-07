package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Gift;
import com.lirins.cn.service.GiftService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("gift")
public class GiftController extends BaseController<Gift,Long> {
    @Autowired
    private GiftService giftService;

    @GetMapping
    public AxiosResult<PageVo<Gift>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Gift> page = giftService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Gift> findById(@PathVariable Long id) {
        return AxiosResult.success(giftService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Gift entity) {
        int i = giftService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Gift entity) {
        int i = giftService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = giftService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
