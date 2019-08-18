package com.fengxiao.auto.example.request.advanced;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AndGreaterThanOrEqualTo;
import com.vipkid.auto.example.annotation.AndIn;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.OrIsNotNull;
import com.vipkid.auto.example.annotation.OrLike;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hujun1
 * @date 2019-08-17 13:14
 */
@AutoExample(value = AdamResource.class,orderBy = {"createTime DESC ","updateTime ASC","id"})
@Getter
@Setter
public class OrderByDto {

  @AndIn(1)
  private List<ResourceType> type;

  @OrLike
  private String name;

  @AndGreaterThanOrEqualTo(2)
  private Long createTime;

  @OrIsNotNull(2)
  private String chineseName;

}
