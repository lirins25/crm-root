package com.lirins.cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
/**
 * 商品转赠品的审核表
 */
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    private String auditIdea;

    private String auditState;

}