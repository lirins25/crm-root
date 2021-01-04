package com.lirins.cn.service.base.Impl;

import com.github.pagehelper.PageInfo;
import com.lirins.cn.mapper.base.BaseMapper;
import com.lirins.cn.service.base.BaseService;
import com.lirins.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version 0.1
 * @ClassName:BaseServiceImpl
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
public class BaseServiceImpl<T,ID> implements BaseService<T,ID> {
    @Autowired
    private BaseMapper<T,ID> baseMapper;

    public BaseMapper<T,ID> getBaseMapper(){
        return baseMapper;
    }

    @Override
    public PageVo<T> findPage() {
        return setPageVo(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> findPage(Object example) {
        return setPageVo(baseMapper.selectByExample(example));
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateEntity(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public int addEntity(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    //操作多次数据库需要加注解
    @Transactional
    @Override
    public int batchAddEntity(List<T> list) {
        //出现异常不return 1  当return 1 证明执行成功
        list.forEach(item-> baseMapper.insert(item));
        return 1;
    }

    @Transactional
    @Override
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item->baseMapper.updateByPrimaryKey(item));
        return 1;
    }
    /**
     * Service不能调用Service（开发规范）：
     * 这里的delete 多次操作可以调用自己的delete单独删除方法
     *
     */
    @Transactional
    @Override
    public int batchDeleteByIds(List<ID> ids) {
        ids.forEach(item->baseMapper.deleteByPrimaryKey(item));
        return 1;
    }

    /**
     * 封装分页数据
     */
    @Override
    public PageVo<T> setPageVo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setList(list);
        pageVo.setTotal(total);
        return pageVo;
    }
}
