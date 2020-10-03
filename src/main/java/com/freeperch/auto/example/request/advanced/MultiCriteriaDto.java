package com.freeperch.auto.example.request.advanced;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AndGreaterThanOrEqualTo;
import com.github.z.auto.example.annotation.AndIn;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.OrIsNotNull;
import com.github.z.auto.example.annotation.OrLike;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hujun
 * @date 2019-08-17 13:14
 */
@AutoExample(value = Resource.class)
@Getter
@Setter
public class MultiCriteriaDto {

  @AndIn(1)
  private List<ResourceType> type;

  @OrLike
  private String name;

  @AndGreaterThanOrEqualTo(2)
  private Long createTime;

  @OrIsNotNull(2)
  private String chineseName;

}
