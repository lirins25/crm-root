package com.lirins.cn.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
@Component
@PropertySource("classpath:aliyun.properties")
public class UploadService {
        @Value("${aliyun_key}")
        public String aliyun_key;
        @Value("${aliyun_secret}")
        public String aliyun_secret;
        @Value("${aliyun_bucketName}")
        public String aliyun_bucketName;
        @Value("${aliyun_baseUrl}")
        public String aliyun_baseUrl;
        @Value("${aliyun_endpoint}")
        public String aliyun_endpoint;
        //    一个文件名 一个输入流
        public String uploadFileByFormDataToAliyun(String fileName, InputStream in) {
            OSS ossClient = new OSSClientBuilder().build(aliyun_endpoint, aliyun_key, aliyun_secret);
            /*
             * 第一个参数： 表示bucket名称
             * 第二个参数： 表示文件名 带后缀
             * 第三个参数： 表示文件的一个流
             * */
            ossClient.putObject(aliyun_bucketName, fileName, in);
            // 关闭OSSClient
            ossClient.shutdown();
            String result = aliyun_baseUrl + fileName;
            return result;
        }
}
