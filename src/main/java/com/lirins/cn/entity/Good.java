package com.lirins.cn.entity;

import java.util.Date;

public class Good {
    private Long id;

    private String goodName;

    private Long categoryId;

    private String brandId;

    private Double goodPrice;

    private Double goodCost;

    private Long goodNumber;

    private String goodState;

    private Double goodDiscount;

    private String goodGift;

    private String goodImg;

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

    public Double getGoodCost() {
        return goodCost;
    }

    public void setGoodCost(Double goodCost) {
        this.goodCost = goodCost;
    }

    public Long getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(Long goodNumber) {
        this.goodNumber = goodNumber;
    }

    public String getGoodState() {
        return goodState;
    }

    public void setGoodState(String goodState) {
        this.goodState = goodState == null ? null : goodState.trim();
    }

    public Double getGoodDiscount() {
        return goodDiscount;
    }

    public void setGoodDiscount(Double goodDiscount) {
        this.goodDiscount = goodDiscount;
    }

    public String getGoodGift() {
        return goodGift;
    }

    public void setGoodGift(String goodGift) {
        this.goodGift = goodGift == null ? null : goodGift.trim();
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg == null ? null : goodImg.trim();
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