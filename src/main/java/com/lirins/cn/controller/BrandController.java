package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Brand;
import com.lirins.cn.service.BrandService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand, Long> {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = brandService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id) {
        return AxiosResult.success(brandService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        int i = brandService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        int i = brandService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = brandService.batchDeleteByIds(ids);
        return toAxios(i);
    }

    /**
     * 查询全部数据 不带分页
     * @return
     */
    @GetMapping("findAllWithoutPage")
    public AxiosResult<List<Brand>> findAllWithoutPage() {
        PageVo<Brand> page = brandService.findPage();
        List<Brand> list = page.getList();
        return AxiosResult.success(list);
    }
}
