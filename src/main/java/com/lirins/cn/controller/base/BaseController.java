package com.lirins.cn.controller.base;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 0.1
 * @ClassName:BaseController
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
public class BaseController<T,ID> {
    /**
     * 如果把增删改查都放到baseController中确实可以访问到 也可以正常执行
     *
     * 弊端：只能单表操作
     */
    @Autowired
    private BaseService<T, ID> baseService;

    @GetMapping
    public AxiosResult<PageVo<T>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<T> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id) {
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody T entity) {
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody T entity) {
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable ID id) {
        int i = baseService.deleteById(id);
        return toAxios(i);
    }

    public AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }

}
