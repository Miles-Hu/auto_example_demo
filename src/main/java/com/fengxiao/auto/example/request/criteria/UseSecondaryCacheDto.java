package com.fengxiao.auto.example.request.criteria;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AutoExample;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-16 20:11
 */
@AutoExample(value = AdamResource.class,useSecondaryCache = true)
@Getter
@Setter
@EqualsAndHashCode
public class UseSecondaryCacheDto {

  private String name;

  private ResourceType type;


}
