package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
public class Consignee extends BaseEntity<Long> {

    private String consigneeName;

    private String consigneePostcode;

    private String consigneeAddress;

    private String consigneeEmail;

    private String consigneePhone;

    private String distributionMode;

    private Double distributionPrice;

    private Date consigneeGettime;

    private String consigneeNote;


}