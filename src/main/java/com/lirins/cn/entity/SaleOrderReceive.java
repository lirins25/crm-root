package com.lirins.cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SaleOrderReceive extends BaseEntity<Long> {

    private String orderType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookingTime;

    private String orderMotion;

    private String businessType;

    private String userAccount;

    private Long consigneeId;

    private String orderPayer;

    private String orderPayment;

    private String orderState;

    private List<SaleOrderGood> orderGoods;

}