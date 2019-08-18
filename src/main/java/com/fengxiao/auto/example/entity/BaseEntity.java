package com.fengxiao.auto.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author hujun
 * @email hujun1@vipkid.com.cn
 * @date 2019-06-06 11:04
 */
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Date createTime;

    private Date updateTime;

}
