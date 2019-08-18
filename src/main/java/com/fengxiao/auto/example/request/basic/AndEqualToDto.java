package com.fengxiao.auto.example.request.basic;

import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AutoExample;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-16 20:11
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class AndEqualToDto {

  private String name;

  private ResourceType type;

}
