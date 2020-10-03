package com.freeperch.auto.example.request.basic;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AndLike;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.OrIn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hujun
 * @date 2019-08-17 11:19
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class OrInDto {

  @AndLike
  private String name;

  @OrIn
  private List<ResourceType> type;

}
