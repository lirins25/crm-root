package com.lirins.cn.controller;

import com.github.pagehelper.PageHelper;
import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.controller.base.BaseController;
import com.lirins.cn.entity.Consignee;
import com.lirins.cn.service.ConsigneeService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:ConsigneeController
 * @Description:
 * @date: 2021/1/7
 * @since JDK 1.8
 */

@RestController
@RequestMapping("consignee")
public class ConsigneeController extends BaseController<Consignee,Long> {
    @Autowired
    private ConsigneeService consigneeService;


    @GetMapping
    public AxiosResult<PageVo<Consignee>> findPage(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Consignee> page = consigneeService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Consignee> findById(@PathVariable Long id) {
        return AxiosResult.success(consigneeService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Consignee entity) {
        int i = consigneeService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Consignee entity) {
        int i = consigneeService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        int i = consigneeService.batchDeleteByIds(ids);
        return toAxios(i);
    }
}
