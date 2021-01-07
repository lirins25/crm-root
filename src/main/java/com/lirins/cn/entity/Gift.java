package com.lirins.cn.entity;

import java.util.Date;

public class Gift {
    private Long id;

    private String goodName;

    private Long categoryId;

    private String brandId;

    private Double goodPrice;

    private Long giftNumber;

    private Double goodCost;

    private String giftState;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getGiftNumber() {
        return giftNumber;
    }

    public void setGiftNumber(Long giftNumber) {
        this.giftNumber = giftNumber;
    }

    public Double getGoodCost() {
        return goodCost;
    }

    public void setGoodCost(Double goodCost) {
        this.goodCost = goodCost;
    }

    public String getGiftState() {
        return giftState;
    }

    public void setGiftState(String giftState) {
        this.giftState = giftState == null ? null : giftState.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}