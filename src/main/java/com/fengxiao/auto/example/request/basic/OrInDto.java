package com.fengxiao.auto.example.request.basic;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AndLike;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrIn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hujun1
 * @date 2019-08-17 11:19
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class OrInDto {

  @AndLike
  private String name;

  @OrIn
  private List<ResourceType> type;

}
