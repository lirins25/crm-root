package com.lirins.cn.common.http;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
//转json的时候 只转存在的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {

    private int status;
    private String message;
    private T data;

    private AxiosResult(){

    }
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        if(data!=null){
            axiosResult.setData(data);
        }
        return axiosResult;
    }
    //成功返回的方法
    public static <T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK, null);
    }

    //成功带数据
    public static <T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK, data);
    }
    //成功返回自定义状态码
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus, null);
    }
    //成功返回自定义状态码
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus, data);
    }

    //错误的返回
    public static <T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROR, null);
    }

    public static <T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROR, data);
    }

    /**
     * 错误带自定义状态码
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus, null);
    }

    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus, data);
    }

}
