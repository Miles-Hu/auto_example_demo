package com.freeperch.auto.example.enums;


import com.github.z.auto.example.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hujun
 * @email miles.j.hoo@gmail.com
 * @date 2019-06-03 17:31
 */
@AllArgsConstructor
@Getter
public enum Deleted implements BaseEnum {
    //
    NO(0),YES(1);

    private Integer code;

}
