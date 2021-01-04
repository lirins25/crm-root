package com.lirins.cn.common.http;

/**
 * @version 0.1
 * @ClassName:AxiosStatus
 * @Description:
 * @date: 2021/1/1
 * @since JDK 1.8
 */
public enum  AxiosStatus {
    OK(2001,"操作成功"),
    ERROR(4001,"操作失败");
    private int status;
    private String message;

    AxiosStatus() {
    }

    AxiosStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
