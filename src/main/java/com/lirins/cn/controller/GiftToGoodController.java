package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.GiftToGood;
import com.lirins.cn.service.GiftToGoodService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("giftToGood")
public class GiftToGoodController extends BaseController<GiftToGood,Long> {
    @Autowired
    private GiftToGoodService giftToGoodService;

    @GetMapping
    public AxiosResult<PageVo<GiftToGood>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<GiftToGood> page = giftToGoodService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<GiftToGood> findById(@PathVariable Long id) {
        return AxiosResult.success(giftToGoodService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody GiftToGood entity) {
        int i = giftToGoodService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody GiftToGood entity) {
        int i = giftToGoodService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = giftToGoodService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
