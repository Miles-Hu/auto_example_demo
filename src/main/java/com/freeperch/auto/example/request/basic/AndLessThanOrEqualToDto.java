package com.freeperch.auto.example.request.basic;


import com.freeperch.auto.example.entity.Resource;
import com.github.z.auto.example.annotation.AndLessThanOrEqualTo;
import com.github.z.auto.example.annotation.AutoExample;
import com.github.z.auto.example.annotation.OrEqualTo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hujun
 * @date 2019-08-16 20:11
 */
@AutoExample(Resource.class)
@Getter
@Setter
public class AndLessThanOrEqualToDto {

  @OrEqualTo
  private String name;

  @AndLessThanOrEqualTo
  private Long createTime;

}
