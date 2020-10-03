package com.freeperch.auto.example.request.advanced;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.ResourceType;
import com.github.z.auto.example.annotation.AutoExample;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-16 20:11
 */
@AutoExample(value = Resource.class,useSecondaryCache = true)
@Getter
@Setter
@EqualsAndHashCode
public class UseSecondaryCacheDto {

  private String name;

  private ResourceType type;


}
