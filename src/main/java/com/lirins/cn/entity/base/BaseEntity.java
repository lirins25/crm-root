package com.lirins.cn.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @version 0.1
 * @ClassName:BaseEntity
 * @Description:
 * @date: 2021/1/4
 * @since JDK 1.8
 */
@Data
public class BaseEntity<ID> {
    private ID id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime addTime;

    private Long creatorId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long updateId;

    public void setData(){
        if(isNew()){
            this.addTime=LocalDateTime.now();
            this.creatorId=1L;
        }
        this.updateTime=LocalDateTime.now();
        this.updateId=2L;
    }
    @JsonIgnore
    public boolean isNew(){
        if(addTime!=null && creatorId!=null){
            return false;
        }else{
            return true;
        }
    }
}
