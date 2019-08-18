package com.fengxiao.auto.example.request.advanced;


import com.fengxiao.auto.example.entity.AdamResource;
import com.fengxiao.auto.example.enums.Deleted;
import com.fengxiao.auto.example.enums.ResourceType;
import com.fengxiao.auto.example.enums.Special;
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
public class ManyEqualToDto {

  private String name;

  private ResourceType type;

  private String chineseName;

  private Integer parentId;

  private String description;

  private Deleted deleted;

  private Integer ownerId;

  private String ownerEmail;

  private String updatePerson;

  private Special special;

}
