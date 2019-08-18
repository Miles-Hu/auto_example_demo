package com.fengxiao.auto.example.request.basic;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AndLike;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrNotIn;
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
public class OrNotInDto {

  @AndLike
  private String name;

  @OrNotIn
  private List<ResourceType> type;

}
