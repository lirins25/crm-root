package com.lirins.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GiftToGood {
    private Long id;

    private Long giftId;

    private String giftName;

    private String categoryName;

    private String brandName;

    private Double giftPrice;

    private Double giftCost;

    private Long giftToGoodNumber;

    private String auditor;

    private Date auditTime;

    private String auditIdea;

    private String auditState;

}