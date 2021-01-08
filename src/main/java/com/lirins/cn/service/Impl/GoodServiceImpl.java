package com.lirins.cn.service.Impl;

import com.lirins.cn.common.http.AxiosResult;
import com.lirins.cn.entity.Brand;
import com.lirins.cn.entity.Good;
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
}
