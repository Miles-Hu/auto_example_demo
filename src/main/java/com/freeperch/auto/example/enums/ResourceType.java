package com.freeperch.auto.example.enums;


import com.github.z.auto.example.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hujun
 * @email miles.j.hoo@gmail.com
 * @date 2019-06-03 17:33
 */
@AllArgsConstructor
@Getter
public enum ResourceType implements BaseEnum {
    //
    MODULE(1),
    RESOURCE_TYPE(2),
    RESOURCE_ID(3);

    private Integer code;
}
