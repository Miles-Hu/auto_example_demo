package com.fengxiao.auto.example.api;

import com.fengxiao.auto.example.request.basic.AndEqualToDto;
import com.fengxiao.auto.example.request.basic.AndGreaterThanDto;
import com.fengxiao.auto.example.request.basic.AndGreaterThanOrEqualToDto;
import com.fengxiao.auto.example.request.basic.AndInDto;
import com.fengxiao.auto.example.request.basic.AndIsNotNullDto;
import com.fengxiao.auto.example.request.basic.AndIsNullDto;
import com.fengxiao.auto.example.request.basic.AndLessThanDto;
import com.fengxiao.auto.example.request.basic.AndLessThanOrEqualToDto;
import com.fengxiao.auto.example.request.basic.AndLikeDto;
import com.fengxiao.auto.example.request.basic.AndNotEqualToDto;
import com.fengxiao.auto.example.request.basic.AndNotInDto;
import com.fengxiao.auto.example.request.basic.AndNotLikeDto;
import com.fengxiao.auto.example.request.basic.OrEqualToDto;
import com.fengxiao.auto.example.request.basic.OrGreaterThanDto;
import com.fengxiao.auto.example.request.basic.OrGreaterThanOrEqualToDto;
import com.fengxiao.auto.example.request.basic.OrInDto;
import com.fengxiao.auto.example.request.basic.OrIsNotNullDto;
import com.fengxiao.auto.example.request.basic.OrIsNullDto;
import com.fengxiao.auto.example.request.basic.OrLessThanDto;
import com.fengxiao.auto.example.request.basic.OrLessThanOrEqualToDto;
import com.fengxiao.auto.example.request.basic.OrLikeDto;
import com.fengxiao.auto.example.request.basic.OrNotEqualToDto;
import com.fengxiao.auto.example.request.basic.OrNotInDto;
import com.fengxiao.auto.example.request.basic.OrNotLikeDto;
import com.fengxiao.auto.example.request.criteria.UpdateBySelectiveDto;
import com.fengxiao.auto.example.response.ClientData;
import com.fengxiao.auto.example.response.ClientPage;
import com.fengxiao.auto.example.response.ClientStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hujun1
 * @date 2019-08-16 20:08
 */
@RequestMapping("/test")
public interface AutoExampleBasicServiceApi {

  @PostMapping("and/equal/to")
  ClientPage simpleAndEqualToTest(@RequestBody AndEqualToDto andEqualToDto);

  @PostMapping("or/equal/to")
  ClientPage simpleOrEqualToTest(@RequestBody OrEqualToDto orEqualToDto);

  @PostMapping("and/like")
  ClientPage simpleAndLikeTest(@RequestBody AndLikeDto andLikeDto);

  @PostMapping("or/like")
  ClientPage simpleOrLikeTest(@RequestBody OrLikeDto orLikeDto);

  @PostMapping("and/in")
  ClientPage simpleAndInTest(@RequestBody AndInDto andInDto);

  @PostMapping("or/in")
  ClientPage simpleOrInTest(@RequestBody OrInDto orInDto);

  @PostMapping("and/greater/than")
  ClientPage simpleAndGreaterThanTest(@RequestBody AndGreaterThanDto andGreaterThanDto);

  @PostMapping("or/greater/than")
  ClientPage simpleOrGreaterThanTest(@RequestBody OrGreaterThanDto orGreaterThanDto);

  @PostMapping("and/greater/than/or/equal/to")
  ClientPage simpleAndGreaterThanOrEqualToTest(@RequestBody AndGreaterThanOrEqualToDto andGreaterThanOrEqualToDto);

  @PostMapping("or/greater/than/or/equal/to")
  ClientPage simpleOrGreaterThanOrEqualToTest(@RequestBody OrGreaterThanOrEqualToDto orGreaterThanOrEqualToDto);

  @PostMapping("and/less/than")
  ClientPage simpleAndLessThanTest(@RequestBody AndLessThanDto andLessThanDto);

  @PostMapping("or/less/than")
  ClientPage simpleOrLessThanTest(@RequestBody OrLessThanDto orLessThanDto);

  @PostMapping("and/less/than/or/equal/to")
  ClientPage simpleAndLessThanOrEqualToTest(@RequestBody AndLessThanOrEqualToDto andLessThanOrEqualToDto);

  @PostMapping("or/less/than/or/equal/to")
  ClientPage simpleOrLessThanOrEqualToTest(@RequestBody OrLessThanOrEqualToDto orLessThanOrEqualToDto);

  @PostMapping("and/is/not/null")
  ClientPage simpleAndIsNotNullTest(@RequestBody AndIsNotNullDto andIsNotNullDto);

  @PostMapping("or/is/not/null")
  ClientPage simpleOrIsNotNullTest(@RequestBody OrIsNotNullDto orIsNotNullDto);

  @PostMapping("and/is/null")
  ClientPage simpleAndIsNullTest(@RequestBody AndIsNullDto andIsNullDto);

  @PostMapping("or/is/null")
  ClientPage simpleOrIsNullTest(@RequestBody OrIsNullDto orIsNullDto);

  @PostMapping("and/not/like")
  ClientPage simpleAndNotLikeTest(@RequestBody AndNotLikeDto andNotLikeDto);

  @PostMapping("or/not/like")
  ClientPage simpleOrNotLikeTest(@RequestBody OrNotLikeDto orNotLikeDto);

  @PostMapping("and/not/in")
  ClientPage simpleAndNotInTest(@RequestBody AndNotInDto andNotInDto);

  @PostMapping("or/not/in")
  ClientPage simpleOrNotInTest(@RequestBody OrNotInDto orNotInDto);

  @PostMapping("and/not/equal/to")
  ClientPage simpleAndNotEqualToTest(@RequestBody AndNotEqualToDto andNotEqualToDto);

  @PostMapping("or/not/equal/to")
  ClientPage simpleOrNotEqualToTest(@RequestBody OrNotEqualToDto orNotEqualToDto);

  @PostMapping("select/one")
  ClientData simpleSelectOneTest(@RequestBody AndEqualToDto andEqualToDto);

  @PostMapping("select/count")
  ClientData simpleSelectCountTest(@RequestBody AndEqualToDto andEqualToDto);

  @PostMapping("update/by/example/selective")
  ClientStatus simpleUpdateBySelectiveTest(@RequestBody UpdateBySelectiveDto updateBySelectiveDto);

  @PostMapping("delete/by/example")
  ClientStatus simpleDeleteByExampleTest(@RequestBody AndEqualToDto andEqualToDto);
}
