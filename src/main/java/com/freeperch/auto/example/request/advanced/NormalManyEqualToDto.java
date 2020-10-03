package com.freeperch.auto.example.request.advanced;


import com.freeperch.auto.example.enums.Deleted;
import com.freeperch.auto.example.enums.ResourceType;
import com.freeperch.auto.example.enums.Special;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-16 20:11
 */
@Getter
@Setter
public class NormalManyEqualToDto {

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
