package com.lirins.cn.entity;

import java.util.Date;

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

    public Long getGoodToGiftId() {
        return goodToGiftId;
    }

    public void setGoodToGiftId(Long goodToGiftId) {
        this.goodToGiftId = goodToGiftId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
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

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Double getGoodCost() {
        return goodCost;
    }

    public void setGoodCost(Double goodCost) {
        this.goodCost = goodCost;
    }

    public Long getGoodToGiftNumber() {
        return goodToGiftNumber;
    }

    public void setGoodToGiftNumber(Long goodToGiftNumber) {
        this.goodToGiftNumber = goodToGiftNumber;
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