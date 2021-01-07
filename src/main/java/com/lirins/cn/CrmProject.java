package com.lirins.cn;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan(basePackages = "com.lirins.cn.mapper")
@EnableTransactionManagement
public class CrmProject {
    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        SpringApplication.run(CrmProject.class);
    }
}
