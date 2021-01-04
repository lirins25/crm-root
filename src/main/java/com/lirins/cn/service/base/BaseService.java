package com.lirins.cn.service.base;

import com.lirins.cn.vo.PageVo;

import java.util.List;

public interface BaseService<T,ID> {
    /**
     * 分页查询
     * */
    PageVo<T> findPage();

    /**
     * 有条件的查询
     * */
    PageVo<T> findPage(Object example);

    /**
     * 通过ID查询
     * */
    T findById(ID id);

    /**
     * 修改操作
     * */
    int updateEntity(T t);

    /**
     * 增加操作
     * */
    int addEntity(T t);

    /**
     * 删除操作
     * */

    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> list);
    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量删除
     */
    int batchDeleteByIds(List<ID> ids);

    PageVo<T> setPageVo(List<T> list);
}
