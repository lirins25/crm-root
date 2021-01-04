package com.lirins.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:PageVo
 * @Description:
 * @date: 2021/1/1
 * @since JDK 1.8
 */
@Data
public class PageVo<T> {
    private long total;
    private List<T> list;
}
