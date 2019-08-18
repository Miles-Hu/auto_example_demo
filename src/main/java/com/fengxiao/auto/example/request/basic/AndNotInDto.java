package com.fengxiao.auto.example.request.basic;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AndLike;
import com.vipkid.auto.example.annotation.AndNotIn;
import com.vipkid.auto.example.annotation.AutoExample;
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
public class AndNotInDto {

  @AndLike
  private String name;

  @AndNotIn
  private List<ResourceType> type;

}
