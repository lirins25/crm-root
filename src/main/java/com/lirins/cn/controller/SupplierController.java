package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Supplier;
import com.lirins.cn.entity.Supplier;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @version 0.1
 * @ClassName:SupplierController
 * @Description:
 * @date: 2021/1/1
 * @since JDK 1.8
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier, Long> {
    @Autowired
    private BaseService<Supplier, Long> baseService;

    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Supplier> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id) {
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity) {
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity) {
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = baseService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
