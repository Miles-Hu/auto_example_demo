package com.fengxiao.auto.example.enums;


import com.vipkid.auto.example.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hujun
 * @email hujun1@vipkid.com.cn
 * @date 2019-06-17 15:05
 */
@AllArgsConstructor
@Getter
public enum Special  implements BaseEnum {
    //
    NO(0),
    YES(1);

    private Integer code;
}
