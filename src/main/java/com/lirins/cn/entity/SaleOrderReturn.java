package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
public class SaleOrderReturn extends BaseEntity<Long> {

    private Long outboundId;

    private Long applyId;

    private String goodType;

    private Long goodNumber;

    private Date entryTime;

}