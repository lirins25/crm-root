package com.lirins.cn.entity;

import java.util.Date;

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

    public Long getGiftToGoodId() {
        return giftToGoodId;
    }

    public void setGiftToGoodId(Long giftToGoodId) {
        this.giftToGoodId = giftToGoodId;
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public Double getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(Double giftPrice) {
        this.giftPrice = giftPrice;
    }

    public Double getGiftCost() {
        return giftCost;
    }

    public void setGiftCost(Double giftCost) {
        this.giftCost = giftCost;
    }

    public Long getGiftToGoodNumber() {
        return giftToGoodNumber;
    }

    public void setGiftToGoodNumber(Long giftToGoodNumber) {
        this.giftToGoodNumber = giftToGoodNumber;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditIdea() {
        return auditIdea;
    }

    public void setAuditIdea(String auditIdea) {
        this.auditIdea = auditIdea == null ? null : auditIdea.trim();
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }
}