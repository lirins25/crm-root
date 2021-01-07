package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Brand;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,String> {
    @Autowired
    private BaseService<Brand, String> baseService;

    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable String id) {
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        entity.setId(UUID.randomUUID().toString().replaceAll("-",""));
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<String> ids) {
        int i = baseService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
