package com.fengxiao.auto.example.request.basic;

import com.fengxiao.auto.example.entity.AdamResource;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrEqualTo;
import com.vipkid.auto.example.annotation.OrGreaterThan;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-16 20:11
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class OrGreaterThanDto {

  @OrEqualTo
  private String name;

  @OrGreaterThan
  private Long createTime;

}
