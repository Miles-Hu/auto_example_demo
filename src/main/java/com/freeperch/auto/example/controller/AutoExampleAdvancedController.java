package com.freeperch.auto.example.controller;

import com.freeperch.auto.example.api.AutoExampleAdvancedServiceApi;
import com.freeperch.auto.example.dao.ResourceMapper;
import com.freeperch.auto.example.entity.Resource;
import com.freeperch.auto.example.request.advanced.DistinctDto;
import com.freeperch.auto.example.request.advanced.ManyEqualToDto;
import com.freeperch.auto.example.request.advanced.MultiCriteriaDto;
import com.freeperch.auto.example.request.advanced.NormalDto;
import com.freeperch.auto.example.request.advanced.NormalManyEqualToDto;
import com.freeperch.auto.example.request.advanced.OrderByDto;
import com.freeperch.auto.example.request.advanced.UseSecondaryCacheDto;
import com.freeperch.auto.example.request.basic.OrEqualToDto;
import com.freeperch.auto.example.response.ClientPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

//import com.github.pagehelper.PageHelper;

//import com.github.pagehelper.Page;

/**
 * @author hujun
 * @date 2019-08-17 13:19
 */
@RestController
public class AutoExampleAdvancedController implements AutoExampleAdvancedServiceApi {

  @Autowired
  private ResourceMapper adamResourceMapper;

  @Override
  public ClientPage multiCriteriaTest(@RequestBody MultiCriteriaDto multiCriteria) {
    return ClientPage.ok(adamResourceMapper.selectByExample(multiCriteria));
  }

  @Override
  public ClientPage orderByTest(@RequestBody OrderByDto orderByDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(orderByDto));
  }

  @Override
  public ClientPage distinctTest(@RequestBody DistinctDto distinctDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(distinctDto));
  }

  @Override
  public ClientPage secondaryCacheTest(@RequestBody UseSecondaryCacheDto useSecondaryCacheDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(useSecondaryCacheDto));
  }

  @Override
  public ClientPage normalTest(@RequestBody NormalDto normalDto) {
    Example example = new Example(Resource.class);
    example.createCriteria().andEqualTo("name", normalDto.getName()).andEqualTo("type", normalDto.getType());
    return ClientPage.ok(adamResourceMapper.selectByExample(example));
  }

  @Override
  public ClientPage simpleCompatibleWithPageHelperTest(@RequestBody OrEqualToDto orEqualToDto) {
    PageHelper.startPage(1, 2);
    List<Resource> adamResources = adamResourceMapper.selectByExample(orEqualToDto);
    return ClientPage.ok(adamResources,((Page)adamResources).getTotal());
  }

  @Override
  public ClientPage simpleManyEqualToTest(@RequestBody ManyEqualToDto manyEqualToDto) {
    return ClientPage.ok(adamResourceMapper.selectByExample(manyEqualToDto));
  }

  @Override
  public ClientPage simpleNormalManyEqualToTest(@RequestBody NormalManyEqualToDto rDto) {
    Example example = new Example(Resource.class);
    Example.Criteria criteria = example.createCriteria();
    if (null != rDto.getChineseName() && !"".equals(rDto.getChineseName())) {
      criteria.andEqualTo("chineseName", rDto.getChineseName());
    }
    if (null != rDto.getName() && !"".equals(rDto.getName())) {
      criteria.andEqualTo("name", rDto.getName());
    }
    if (null != rDto.getParentId()) {
      criteria.andEqualTo("parentId", rDto.getParentId());
    }
    if (null != rDto.getDescription() && !"".equals(rDto.getDescription())) {
      criteria.andEqualTo("description", rDto.getDescription());
    }
    if (null != rDto.getOwnerEmail() && !"".equals(rDto.getOwnerEmail())) {
      criteria.andEqualTo("ownerEmail", rDto.getOwnerEmail());
    }
    if (null != rDto.getOwnerId()) {
      criteria.andEqualTo("ownerId", rDto.getOwnerId());
    }
    if (null != rDto.getUpdatePerson() && !"".equals(rDto.getUpdatePerson())) {
      criteria.andEqualTo("updatePerson", rDto.getUpdatePerson());
    }
    return ClientPage.ok(adamResourceMapper.selectByExample(example));
  }


}
