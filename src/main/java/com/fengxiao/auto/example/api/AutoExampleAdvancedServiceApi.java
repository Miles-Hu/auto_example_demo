package com.fengxiao.auto.example.api;

import com.fengxiao.auto.example.request.basic.OrEqualToDto;
import com.fengxiao.auto.example.request.criteria.DistinctDto;
import com.fengxiao.auto.example.request.criteria.MultiCriteriaDto;
import com.fengxiao.auto.example.request.criteria.NormalDto;
import com.fengxiao.auto.example.request.criteria.OrderByDto;
import com.fengxiao.auto.example.request.criteria.UseSecondaryCacheDto;
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

}
