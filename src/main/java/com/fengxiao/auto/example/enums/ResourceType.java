package com.fengxiao.auto.example.enums;


import com.vipkid.auto.example.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hujun
 * @email hujun1@vipkid.com.cn
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
