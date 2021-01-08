package com.lirins.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GiftToGood {
    private Long giftToGoodId;

    private Long giftId;

    private String giftName;

    private Long categoryId;

    private String brandId;

    private Double giftPrice;

    private Double giftCost;

    private Long giftToGoodNumber;

    private String auditor;

    private Date auditTime;

    private String auditIdea;

    private String auditState;


}