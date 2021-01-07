package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Category;
import com.lirins.cn.entity.Category;
import com.lirins.cn.service.CategoryService;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @version 0.1
 * @ClassName:CategoryController
 * @Description:
 * @date: 2021/1/1
 * @since JDK 1.8
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category,Long> {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("getTreeData")
    public AxiosResult<List<Category>> getTreeData(){
       List<Category> list =  categoryService.getTreeData();
       return AxiosResult.success(list);
    }


    @GetMapping
    public AxiosResult<PageVo<Category>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Category> page = categoryService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id) {
        return AxiosResult.success(categoryService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity) {
        int i = categoryService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity) {
        int i = categoryService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = categoryService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
