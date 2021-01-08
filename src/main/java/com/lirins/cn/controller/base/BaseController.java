package com.lirins.cn.controller.base;
import com.lirins.cn.common.http.AxiosResult;

/**
 * @version 0.1
 * @ClassName:BaseController
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
public class BaseController<T,ID> {
    /**
     * 如果把增删改查都放到baseController中确实可以访问到 也可以正常执行
     *
     * 弊端：只能单表操作
     */
    public AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }

}
