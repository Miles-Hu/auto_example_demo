package com.fengxiao.auto.example.request.basic;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrNotLike;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-17 11:04
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class OrNotLikeDto {

  private ResourceType type;

  @OrNotLike
  private String name;


}
