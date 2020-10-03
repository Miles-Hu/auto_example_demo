package com.freeperch.auto.example;

import com.freeperch.auto.example.api.AutoExampleBasicServiceApi;
import com.freeperch.auto.example.enums.ResourceType;
import com.freeperch.auto.example.request.basic.AndEqualToDto;
import com.freeperch.auto.example.request.basic.AndGreaterThanDto;
import com.freeperch.auto.example.request.basic.AndGreaterThanOrEqualToDto;
import com.freeperch.auto.example.request.basic.AndInDto;
import com.freeperch.auto.example.request.basic.AndLessThanDto;
import com.freeperch.auto.example.request.basic.AndLessThanOrEqualToDto;
import com.freeperch.auto.example.request.basic.AndLikeDto;
import com.freeperch.auto.example.request.basic.OrEqualToDto;
import com.freeperch.auto.example.request.basic.OrGreaterThanDto;
import com.freeperch.auto.example.request.basic.OrGreaterThanOrEqualToDto;
import com.freeperch.auto.example.request.basic.OrInDto;
import com.freeperch.auto.example.request.basic.OrLessThanDto;
import com.freeperch.auto.example.request.basic.OrLikeDto;
import com.freeperch.auto.example.response.ClientPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author hujun
 * @date 2019-08-17 10:20
 */
@Slf4j
public class BasicFunctionTests extends BaseTests {

  @Autowired
  private AutoExampleBasicServiceApi autoExampleBasicServiceApi;

  @Test
  public void test1() throws Exception {
    AndEqualToDto andEqualToDto = new AndEqualToDto();
    andEqualToDto.setName("granary");
    andEqualToDto.setType(ResourceType.MODULE);
    ClientPage clientPage = autoExampleBasicServiceApi.simpleAndEqualToTest(andEqualToDto);
    printPage(clientPage);
  }

  @Test
  public void test2() throws Exception {
    OrEqualToDto orEqualToDto = new OrEqualToDto();
    orEqualToDto.setName("granary");
    orEqualToDto.setType(ResourceType.RESOURCE_TYPE);
    ClientPage clientPage = autoExampleBasicServiceApi.simpleOrEqualToTest(orEqualToDto);
    printPage(clientPage);
  }

  @Test
  public void test3() throws Exception {
    AndLikeDto andLikeDto = new AndLikeDto();
    andLikeDto.setType(ResourceType.MODULE);
    andLikeDto.setName("grana");
    printPage(autoExampleBasicServiceApi.simpleAndLikeTest(andLikeDto));
  }

  @Test
  public void test4() throws Exception {
    OrLikeDto orLikeDto = new OrLikeDto();
    orLikeDto.setType(ResourceType.MODULE);
    orLikeDto.setName("fm");
    printPage(autoExampleBasicServiceApi.simpleOrLikeTest(orLikeDto));
  }

  @Test
  public void test5() throws Exception {
    AndInDto andInDto = new AndInDto();
    andInDto.setName("granary");
    andInDto.setType(Arrays.asList(ResourceType.MODULE,ResourceType.RESOURCE_TYPE));
    printPage(autoExampleBasicServiceApi.simpleAndInTest(andInDto));
  }

  @Test
  public void test6() throws Exception {
    OrInDto orInDto = new OrInDto();
    orInDto.setName("granary");
    orInDto.setType(Arrays.asList(ResourceType.MODULE,ResourceType.RESOURCE_TYPE));
    printPage(autoExampleBasicServiceApi.simpleOrInTest(orInDto));
  }

  @Test
  public void test7() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    AndGreaterThanDto andGreaterThanDto = new AndGreaterThanDto();
    andGreaterThanDto.setName("granary");
    andGreaterThanDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleAndGreaterThanTest(andGreaterThanDto));
  }

  @Test
  public void test8() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    OrGreaterThanDto orGreaterThanDto = new OrGreaterThanDto();
    orGreaterThanDto.setName("granary");
    orGreaterThanDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleOrGreaterThanTest(orGreaterThanDto));
  }

  @Test
  public void test9() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    AndGreaterThanOrEqualToDto andGreaterThanOrEqualToDto = new AndGreaterThanOrEqualToDto();
    andGreaterThanOrEqualToDto.setName("granary");
    andGreaterThanOrEqualToDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleAndGreaterThanOrEqualToTest(andGreaterThanOrEqualToDto));
  }

  @Test
  public void test10() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    OrGreaterThanOrEqualToDto orGreaterThanOrEqualToDto = new OrGreaterThanOrEqualToDto();
    orGreaterThanOrEqualToDto.setName("granary");
    orGreaterThanOrEqualToDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleOrGreaterThanOrEqualToTest(orGreaterThanOrEqualToDto));
  }

  @Test
  public void test11() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    AndLessThanDto andLessThanDto = new AndLessThanDto();
    andLessThanDto.setName("granary");
    andLessThanDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleAndLessThanTest(andLessThanDto));
  }

  @Test
  public void test12() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    OrLessThanDto orLessThanDto = new OrLessThanDto();
    orLessThanDto.setName("granary");
    orLessThanDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleOrLessThanTest(orLessThanDto));
  }

  @Test
  public void test13() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    AndLessThanOrEqualToDto andLessThanOrEqualToDto = new AndLessThanOrEqualToDto();
    andLessThanOrEqualToDto.setName("granary");
    andLessThanOrEqualToDto.setCreateTime(time);
    printPage(autoExampleBasicServiceApi.simpleAndLessThanOrEqualToTest(andLessThanOrEqualToDto));
  }
}
