package com.freeperch.auto.example.request.basic;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AndLike;
import com.github.z.auto.example.annotation.AutoExample;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-17 11:04
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class AndLikeDto {

  private ResourceType type;
  @AndLike
  private String name;


}
