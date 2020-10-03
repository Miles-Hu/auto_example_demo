package com.freeperch.auto.example.request.basic;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.OrEqualTo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-17 10:41
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class OrEqualToDto {

  private String name;

  @OrEqualTo
  private ResourceType type;

}
