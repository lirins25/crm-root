package com.lirins.cn.service.Impl;

import com.lirins.cn.entity.Brand;
import com.lirins.cn.entity.Category;
import com.lirins.cn.mapper.CategoryMapper;
import com.lirins.cn.service.BrandService;
import com.lirins.cn.service.CategoryService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 0.1
 * @ClassName:BrandServiceImpl
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category,Long> implements CategoryService {
    @Autowired
    private CategoryMapper mapper;
    @Override
    public List<Category> getTreeData() {

        //通过父ID等于0拿到一级List<category>
        //遍历一级拿二级
        //遍历二级拿3级
        List<Category> categories = mapper.selectByExample(null);
        //过滤出一级数据
        List<Category> childList = categories.stream().filter(category -> category.getParentId().equals(0L)).collect(Collectors.toList());
        childList.forEach(category -> {
            getChildren(categories,category);
        });
        return childList;
    }
    public void getChildren(List<Category> categories,Category category){
        List<Category> childList = categories.stream().filter(category1 -> category1.getParentId().equals(category.getId())).collect(Collectors.toList());
        if(childList.size()>0){
            category.setChildren(childList);
            childList.forEach(item->{
                getChildren(categories,item);
            });
        }
    }
}
