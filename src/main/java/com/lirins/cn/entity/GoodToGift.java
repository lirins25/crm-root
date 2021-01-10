package com.lirins.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GoodToGift {
    private Long id;

    private Long goodId;

    private String goodName;

    private String categoryName;

    private String brandName;

    private Double goodPrice;

    private Double goodCost;

    private Long goodToGiftNumber;

    private String auditor;

    private Date auditTime;

    private String auditIdea;

    private String auditState;

}