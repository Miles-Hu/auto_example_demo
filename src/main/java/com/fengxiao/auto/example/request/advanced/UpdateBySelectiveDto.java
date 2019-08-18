package com.fengxiao.auto.example.request.advanced;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.ResourceType;
import com.vipkid.auto.example.annotation.AutoExample;
import com.vipkid.auto.example.annotation.Ignore;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun1
 * @date 2019-08-16 20:11
 */
@AutoExample(AdamResource.class)
@Getter
@Setter
public class UpdateBySelectiveDto {

  private String name;

  private ResourceType type;

  @Ignore
  private String chineseName;

}