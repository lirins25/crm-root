package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Category extends BaseEntity<Long> {
    private Long id;

    private String categoryName;

    private String categoryDesc;

    private String parentId;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    }