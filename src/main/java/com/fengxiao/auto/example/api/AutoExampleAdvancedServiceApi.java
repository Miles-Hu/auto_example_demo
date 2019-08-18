package com.fengxiao.auto.example.api;

import com.fengxiao.auto.example.request.advanced.DistinctDto;
import com.fengxiao.auto.example.request.advanced.ManyEqualToDto;
import com.fengxiao.auto.example.request.advanced.MultiCriteriaDto;
import com.fengxiao.auto.example.request.advanced.NormalDto;
import com.fengxiao.auto.example.request.advanced.NormalManyEqualToDto;
import com.fengxiao.auto.example.request.advanced.OrderByDto;
import com.fengxiao.auto.example.request.advanced.UseSecondaryCacheDto;
import com.fengxiao.auto.example.request.basic.OrEqualToDto;
import com.fengxiao.auto.example.response.ClientPage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hujun1
 * @date 2019-08-17 13:12
 */
@RequestMapping("/test/advanced")
public interface AutoExampleAdvancedServiceApi {

  @PostMapping("/criteria/multi")
  ClientPage multiCriteriaTest(@RequestBody MultiCriteriaDto multiCriteria);

  @PostMapping("order/by")
  ClientPage orderByTest(@RequestBody OrderByDto orderByDto);

  @PostMapping("distinct")
  ClientPage distinctTest(@RequestBody DistinctDto distinctDto);

  @PostMapping("secondary/cache")
  ClientPage secondaryCacheTest(@RequestBody UseSecondaryCacheDto useSecondaryCacheDto);

  @PostMapping("normal")
  ClientPage normalTest(@RequestBody NormalDto normalDto);

  @PostMapping("compatible/with/page/helper")
  ClientPage simpleCompatibleWithPageHelperTest(@RequestBody OrEqualToDto orEqualToDto);

  @PostMapping("present/many/equal/to")
  ClientPage simpleManyEqualToTest(@RequestBody ManyEqualToDto manyEqualToDto);

  @PostMapping("present/normal/many/equal/to")
  ClientPage simpleNormalManyEqualToTest(@RequestBody NormalManyEqualToDto normalManyEqualToDto);
}
