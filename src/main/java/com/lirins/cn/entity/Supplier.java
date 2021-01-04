package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
public class Supplier extends BaseEntity<Long> {

    private String supplierName;

    private String supplierContact;

    private String supplierPhone;

    private String supplierEmail;

    private String supplierAddress;

    private String supplierBrank;

    private String supplierBrankCode;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    }