package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
public class SaleOrderGood extends BaseEntity<Long> {

    private Long goodId;

    private Long goodAmount;

    private Double goodPrice;

    private Long receiveId;


}