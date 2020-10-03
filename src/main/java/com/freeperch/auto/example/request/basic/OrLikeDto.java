package com.freeperch.auto.example.request.basic;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.OrLike;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-17 11:12
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class OrLikeDto {

  private ResourceType type;
  @OrLike
  private String name;


}
