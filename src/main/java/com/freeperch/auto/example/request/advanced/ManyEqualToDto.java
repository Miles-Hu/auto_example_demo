package com.freeperch.auto.example.request.advanced;


import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.enums.Deleted;
import com.freeperch.auto.example.enums.ResourceType;
import com.freeperch.auto.example.enums.Special;
import com.github.z.auto.example.annotation.AutoExample;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-16 20:11
 */
@AutoExample(Resource.class)
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
