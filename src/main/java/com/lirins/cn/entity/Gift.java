package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;


@Data
public class Gift extends BaseEntity<Long> {

    private String goodName;

    private Long categoryId;

    private String brandId;

    private Double goodPrice;

    private Long giftNumber;

    private Double goodCost;

    private String giftState;

}