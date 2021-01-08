package com.lirins.cn.entity;

import com.lirins.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class SaleOrderOutbound extends BaseEntity<Long> {

    private Long receiveId;

    private String serviceNote;

    private Date processTime;

    private Long supplierId;

    private Boolean isReturn;


}