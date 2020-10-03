package com.freeperch.auto.example.entity;


import com.freeperch.auto.example.enums.Deleted;
import com.freeperch.auto.example.enums.ResourceType;
import com.freeperch.auto.example.enums.Special;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Transient;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resource extends BaseEntity {
    private ResourceType type;

    private String name;

    private String chineseName;

    private Integer parentId;

    private String description;

    private Deleted deleted;

    private Integer ownerId;

    private String ownerEmail;

    private String updatePerson;

    private Special special;

    /**
     * 是否具有权限
     */
    @Transient
    private Boolean grantAuth;
    /**
     * 是否具有删除权限，只有owner才具有删除权限
     */
    @Transient
    private Boolean isOwner;
}