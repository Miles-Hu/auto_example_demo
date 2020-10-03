package com.freeperch.auto.example.api;

import com.freeperch.auto.example.request.advanced.DistinctDto;
import com.freeperch.auto.example.request.advanced.ManyEqualToDto;
import com.freeperch.auto.example.request.advanced.MultiCriteriaDto;
import com.freeperch.auto.example.request.advanced.NormalDto;
import com.freeperch.auto.example.request.advanced.NormalManyEqualToDto;
import com.freeperch.auto.example.request.advanced.OrderByDto;
import com.freeperch.auto.example.request.advanced.UseSecondaryCacheDto;
import com.freeperch.auto.example.request.basic.OrEqualToDto;
import com.freeperch.auto.example.response.ClientPage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hujun
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
