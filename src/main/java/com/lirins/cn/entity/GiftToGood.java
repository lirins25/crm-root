package com.lirins.cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
/**
 * 赠品转商品的审核表
 */
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    private String auditIdea;

    private String auditState;

}