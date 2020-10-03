package com.freeperch.auto.example.request.advanced;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.Ignore;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-16 20:11
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class UpdateBySelectiveDto {

  private String name;

  private ResourceType type;

  @Ignore
  private String chineseName;

}
