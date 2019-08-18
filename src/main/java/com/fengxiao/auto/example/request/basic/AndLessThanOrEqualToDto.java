package com.fengxiao.auto.example.request.basic;


import com.fengxiao.auto.example.entity.AdamResource;
import com.vipkid.auto.example.annotation.AndLessThanOrEqualTo;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrEqualTo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-16 20:11
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class AndLessThanOrEqualToDto {

  @OrEqualTo
  private String name;

  @AndLessThanOrEqualTo
  private Long createTime;

}
