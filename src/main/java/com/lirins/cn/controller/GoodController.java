package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.dto.GoodSelectDto;
import com.lirins.cn.entity.Good;
import com.lirins.cn.service.BrandService;
import com.lirins.cn.service.CategoryService;
import com.lirins.cn.service.GoodService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("good")
public class GoodController extends BaseController<Good, Long> {
    @Autowired
    private GoodService goodService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public AxiosResult<PageVo<Good>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Good> page = goodService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Good> findById(@PathVariable Long id) {
        return AxiosResult.success(goodService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Good entity) {
        int i = goodService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Good entity) {
        int i = goodService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = goodService.batchDeleteByIds(ids);
        return toAxios(i);
    }

    /**
     * 将文件上传到阿里云 同时返回图片地址给前端
     */
    @PostMapping("upload")
    public AxiosResult<String> upload(HttpServletRequest request) {
        String upload = goodService.upload(request);
        System.out.println(upload);
        return AxiosResult.success(upload);
    }

    //条件查询
    @PostMapping("selectAll")
    public AxiosResult<PageVo<Good>> selectAll( GoodSelectDto goodSelectDto,
                                                @RequestParam(defaultValue = "1") int currentPage
            ,@RequestParam(defaultValue = "5") int pageSize) {
        List<Good> goods = goodService.selectByExample(goodSelectDto);
        PageHelper.startPage(currentPage, pageSize);
        PageInfo<Good> goodPageInfo = new PageInfo<>(goods);
        long total = goodPageInfo.getTotal();
        PageVo<Good> pageVo = new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setList(goods);
        return AxiosResult.success(pageVo);
    }

}
