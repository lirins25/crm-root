package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.GoodToGift;
import com.lirins.cn.service.GoodToGiftService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("goodToGift")
public class GoodToGiftController extends BaseController<GoodToGift,Long> {
    @Autowired
    private GoodToGiftService goodToGiftService;

    @GetMapping
    public AxiosResult<PageVo<GoodToGift>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<GoodToGift> page = goodToGiftService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<GoodToGift> findById(@PathVariable Long id) {
        return AxiosResult.success(goodToGiftService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody GoodToGift entity) {
        int i = goodToGiftService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody GoodToGift entity) {
        int i = goodToGiftService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = goodToGiftService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
