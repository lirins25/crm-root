package com.lirins.cn.dto;

import lombok.Data;

/**
 * @version 0.1
 * @ClassName:SaleReceiveSearchDto
 * @Description:
 * @date: 2021/1/8
 * @since JDK 1.8
 */
@Data
public class SaleOrderReceiveSearchDto {
    //订单类型
    private String orderType;
    //订单动作
    private String orderMotion;
    //业务类型
    private String businessType;
    //收件人ID
    private String consigneeId;
    //支付方式
    private String orderPayment;
    //订单状态
    private String orderState;
}
