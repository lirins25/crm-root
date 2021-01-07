package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Category extends BaseEntity<Long> {

    private String categoryName;

    private String categoryDesc;

    private Long parentId;

    private List<Category> children;


    }