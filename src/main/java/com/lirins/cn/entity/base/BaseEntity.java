package com.lirins.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @version 0.1
 * @ClassName:BaseEntity
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Data
public class BaseEntity<ID> {
    private ID id;
    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}
