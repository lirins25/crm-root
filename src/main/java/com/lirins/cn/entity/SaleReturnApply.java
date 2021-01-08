package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class SaleReturnApply extends BaseEntity<Long> {

    private String applyName;

    private String applyPhone;

    private String applyEmail;

    private Date applyTime;

}