package com.fengxiao.auto.example.controller;


import com.fengxiao.auto.example.api.AutoExampleBasicServiceApi;
import com.fengxiao.auto.example.dao.AdamResourceMapper;
import com.fengxiao.auto.example.entity.AdamResource;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hujun1
 * @date 2019-08-16 20:31
 */
@RestController
public class AutoExampleBasicController implements AutoExampleBasicServiceApi {

  @Autowired
  private AdamResourceMapper adamResourceMapper;

  @Override
  public ClientPage simpleAndEqualToTest(@RequestBody AndEqualToDto andEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andEqualToDto));
  }

  @Override
  public ClientPage simpleOrEqualToTest(@RequestBody OrEqualToDto orEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orEqualToDto));
  }

  @Override
  public ClientPage simpleAndLikeTest(@RequestBody AndLikeDto andLikeDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andLikeDto));
  }

  @Override
  public ClientPage simpleOrLikeTest(@RequestBody OrLikeDto orLikeDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orLikeDto));
  }

  @Override
  public ClientPage simpleAndInTest(@RequestBody AndInDto andInDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andInDto));
  }

  @Override
  public ClientPage simpleOrInTest(@RequestBody OrInDto orInDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orInDto));
  }

  @Override
  public ClientPage simpleAndGreaterThanTest(@RequestBody AndGreaterThanDto andGreaterThanDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andGreaterThanDto));
  }

  @Override
  public ClientPage simpleOrGreaterThanTest(@RequestBody OrGreaterThanDto orGreaterThanDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orGreaterThanDto));
  }

  @Override
  public ClientPage simpleAndGreaterThanOrEqualToTest(@RequestBody AndGreaterThanOrEqualToDto andGreaterThanOrEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andGreaterThanOrEqualToDto));
  }

  @Override
  public ClientPage simpleOrGreaterThanOrEqualToTest(@RequestBody OrGreaterThanOrEqualToDto orGreaterThanOrEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orGreaterThanOrEqualToDto));
  }

  @Override
  public ClientPage simpleAndLessThanTest(@RequestBody AndLessThanDto andLessThanDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andLessThanDto));
  }

  @Override
  public ClientPage simpleOrLessThanTest(@RequestBody OrLessThanDto orLessThanDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orLessThanDto));
  }

  @Override
  public ClientPage simpleAndLessThanOrEqualToTest(@RequestBody AndLessThanOrEqualToDto andLessThanOrEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andLessThanOrEqualToDto));
  }

  @Override
  public ClientPage simpleOrLessThanOrEqualToTest(@RequestBody OrLessThanOrEqualToDto orLessThanOrEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orLessThanOrEqualToDto));
  }

  @Override
  public ClientPage simpleAndIsNotNullTest(@RequestBody AndIsNotNullDto andIsNotNullDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andIsNotNullDto));
  }

  @Override
  public ClientPage simpleOrIsNotNullTest(@RequestBody OrIsNotNullDto orIsNotNullDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orIsNotNullDto));
  }

  @Override
  public ClientPage simpleAndIsNullTest(@RequestBody AndIsNullDto andIsNullDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andIsNullDto));
  }

  @Override
  public ClientPage simpleOrIsNullTest(@RequestBody OrIsNullDto orIsNullDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orIsNullDto));
  }

  @Override
  public ClientPage simpleAndNotLikeTest(@RequestBody AndNotLikeDto andNotLikeDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andNotLikeDto));
  }

  @Override
  public ClientPage simpleOrNotLikeTest(@RequestBody OrNotLikeDto orNotLikeDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orNotLikeDto));
  }

  @Override
  public ClientPage simpleAndNotInTest(@RequestBody AndNotInDto andNotInDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andNotInDto));
  }

  @Override
  public ClientPage simpleOrNotInTest(@RequestBody OrNotInDto orNotInDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orNotInDto));
  }

  @Override
  public ClientPage simpleAndNotEqualToTest(@RequestBody AndNotEqualToDto andNotEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(andNotEqualToDto));
  }

  @Override
  public ClientPage simpleOrNotEqualToTest(@RequestBody OrNotEqualToDto orNotEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orNotEqualToDto));
  }

  @Override
  public ClientData simpleSelectOneTest(@RequestBody AndEqualToDto andEqualToDto) {
    return ClientData.ok(adamResourceMapper.selectOneByExample(andEqualToDto));
  }

  @Override
  public ClientData simpleSelectCountTest(@RequestBody AndEqualToDto andEqualToDto) {
    return ClientData.ok(adamResourceMapper.selectCountByExample(andEqualToDto));
  }

  @Override
  public ClientStatus simpleUpdateBySelectiveTest(@RequestBody UpdateBySelectiveDto updateBySelectiveDto) {
    AdamResource adamResource = new AdamResource();
    adamResource.setChineseName(updateBySelectiveDto.getChineseName());
    adamResourceMapper.updateByExampleSelective(adamResource, updateBySelectiveDto);
    return ClientStatus.ok();
  }

  @Override
  public ClientStatus simpleDeleteByExampleTest(@RequestBody AndEqualToDto andEqualToDto) {
    adamResourceMapper.deleteByExample(andEqualToDto);
    return ClientStatus.ok();
  }
}
