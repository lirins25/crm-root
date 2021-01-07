package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;


@Data
public class Good extends BaseEntity<Long> {

    private String goodName;

    private Long categoryId;

    private String brandId;

    private Double goodPrice;

    private Double goodCost;

    private Long goodNumber;

    private String goodState;

    private Double goodDiscount;

    private String goodGift;

    private String goodImg;

}