package com.lirins.cn.service.Impl;

import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.dto.GoodSelectDto;
import com.lirins.cn.entity.Brand;
import com.lirins.cn.entity.Good;
import com.lirins.cn.entity.GoodExample;
import com.lirins.cn.mapper.GoodMapper;
import com.lirins.cn.service.BrandService;
import com.lirins.cn.service.GoodService;
import com.lirins.cn.service.base.Impl.BaseServiceImpl;
import com.lirins.cn.utils.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @version 0.1
 * @ClassName:BrandServiceImpl
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Service
@Transactional
public class GoodServiceImpl extends BaseServiceImpl<Good,Long> implements GoodService {

    @Autowired
    private GoodMapper goodMapper;
    @Autowired
    private UploadService uploadService;

    /**
     * 将商品图片上传到阿里云
     * @param request
     * @return
     */
    @Override
    public String upload(HttpServletRequest request) {
        Part avatar = null;
        try {
            avatar = request.getPart("avatar");
            System.out.println(avatar);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        if (avatar == null) {
            System.out.println("avatar为null");
        }
        String fileName = UUID.randomUUID().toString() + "." + StringUtils.getFilenameExtension(avatar.getSubmittedFileName());
        String submittedFileName = avatar.getSubmittedFileName();
        System.out.println(submittedFileName);
        String s = null;
        try {
          s = uploadService.uploadFileByFormDataToAliyun(fileName, avatar.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * 条件查询
     * @param goodSelectDto
     * @return
     */
    @Override
    public List<Good> selectByExample(GoodSelectDto goodSelectDto) {
        System.out.println(goodSelectDto);
        System.out.println(goodSelectDto.getGoodName());
        GoodExample goodExample = new GoodExample();
        GoodExample.Criteria criteriaGoodName = goodExample.createCriteria();
        GoodExample.Criteria criteriaCategory = goodExample.createCriteria();
        GoodExample.Criteria criteriaBrand = goodExample.createCriteria();
        GoodExample.Criteria criteriaGoodStatue = goodExample.createCriteria();

        int number = 0;
        //如果有值不为空则证明有值传过来
        if (!StringUtils.isEmpty(goodSelectDto.getGoodName()) && !goodSelectDto.getGoodName().equals("undefined")) {
            number++;
            criteriaGoodName.andGoodNameLike("%"+ goodSelectDto.getGoodName()+"%");
            criteriaCategory.andGoodNameLike("%"+ goodSelectDto.getGoodName()+"%");
            criteriaBrand.andGoodNameLike("%"+ goodSelectDto.getGoodName()+"%");
            criteriaGoodStatue.andGoodNameLike("%"+ goodSelectDto.getGoodName()+"%");

        }
        if (!StringUtils.isEmpty(goodSelectDto.getCategoryName()) && !goodSelectDto.getCategoryName().equals("undefined")) {
            number++;
            criteriaGoodName.andCategoryNameEqualTo(goodSelectDto.getCategoryName());
            criteriaCategory.andCategoryNameEqualTo(goodSelectDto.getCategoryName());
            criteriaBrand.andCategoryNameEqualTo(goodSelectDto.getCategoryName());
            criteriaGoodStatue.andCategoryNameEqualTo(goodSelectDto.getCategoryName());

        }
        if (!StringUtils.isEmpty(goodSelectDto.getBrandName()) && !goodSelectDto.getBrandName().equals("undefined")) {
            number++;
            criteriaGoodName.andBrandNameEqualTo(goodSelectDto.getBrandName());
            criteriaCategory.andBrandNameEqualTo(goodSelectDto.getBrandName());
            criteriaBrand.andBrandNameEqualTo(goodSelectDto.getBrandName());
            criteriaGoodStatue.andBrandNameEqualTo(goodSelectDto.getBrandName());
        }
        if (!StringUtils.isEmpty(goodSelectDto.getGoodState()) && !goodSelectDto.getGoodState().equals("undefined")) {
            number++;
            criteriaGoodName.andGoodStateEqualTo(goodSelectDto.getGoodState());
            criteriaCategory.andGoodStateEqualTo(goodSelectDto.getGoodState());
            criteriaBrand.andGoodStateEqualTo(goodSelectDto.getGoodState());
            criteriaGoodStatue.andGoodStateEqualTo(goodSelectDto.getGoodState());
        }

        if (number == 0) {
            List<Good> goods = goodMapper.selectByExample(null);
            return goods;
        } else {
            System.out.println(number);
            goodExample.or(criteriaGoodName);
            goodExample.or(criteriaCategory);
            goodExample.or(criteriaBrand);
            goodExample.or(criteriaGoodStatue);
            List<Good> goods = goodMapper.selectByExample(goodExample);
            return goods;
        }
    }
}
