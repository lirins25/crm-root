package com.lirins.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GoodToGift {
    private Long goodToGiftId;

    private Long goodId;

    private String goodName;

    private Long categoryId;

    private String brandId;

    private Double goodPrice;

    private Double goodCost;

    private Long goodToGiftNumber;

    private String auditor;

    private Date auditTime;

    private String auditIdea;

    private String auditState;

}