package com.freeperch.auto.example;

import com.freeperch.auto.example.api.AutoExampleAdvancedServiceApi;
import com.freeperch.auto.example.api.AutoExampleBasicServiceApi;
import com.freeperch.auto.example.enums.ResourceType;
import com.freeperch.auto.example.request.advanced.DistinctDto;
import com.freeperch.auto.example.request.advanced.ManyEqualToDto;
import com.freeperch.auto.example.request.advanced.MultiCriteriaDto;
import com.freeperch.auto.example.request.advanced.NormalDto;
import com.freeperch.auto.example.request.advanced.NormalManyEqualToDto;
import com.freeperch.auto.example.request.advanced.OrderByDto;
import com.freeperch.auto.example.request.advanced.UseSecondaryCacheDto;
import com.freeperch.auto.example.request.basic.AndEqualToDto;
import com.freeperch.auto.example.request.basic.OrEqualToDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hujun
 * @date 2019-08-17 13:20
 */
public class AdvancedTests extends BaseTests {

  @Autowired
  private AutoExampleAdvancedServiceApi autoExampleAdvancedServiceApi;

  @Autowired
  private AutoExampleBasicServiceApi autoExampleBasicServiceApi;

  @Test
  public void test1() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    MultiCriteriaDto multiCriteriaDto = new MultiCriteriaDto();
    multiCriteriaDto.setName("granary");
    multiCriteriaDto.setType(Arrays.asList(ResourceType.MODULE,ResourceType.RESOURCE_TYPE));
    multiCriteriaDto.setCreateTime(time);
    printPage(autoExampleAdvancedServiceApi.multiCriteriaTest(multiCriteriaDto));
  }

  @Test
  public void test2() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    OrderByDto orderByDto = new OrderByDto();
    orderByDto.setName("granary");
    orderByDto.setType(Arrays.asList(ResourceType.MODULE,ResourceType.RESOURCE_TYPE));
    orderByDto.setCreateTime(time);
    printPage(autoExampleAdvancedServiceApi.orderByTest(orderByDto));
  }

  @Test
  public void test3() throws Exception {
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-07 20:50:28").getTime();
    DistinctDto distinctDto = new DistinctDto();
    distinctDto.setName("granary");
    distinctDto.setType(Arrays.asList(ResourceType.MODULE,ResourceType.RESOURCE_TYPE));
    distinctDto.setCreateTime(time);
    printPage(autoExampleAdvancedServiceApi.distinctTest(distinctDto));
  }


  @Test
  public void test4() throws Exception {
    UseSecondaryCacheDto useSecondaryCacheDto = new UseSecondaryCacheDto();
    useSecondaryCacheDto.setName("granary");
    useSecondaryCacheDto.setType(ResourceType.MODULE);
    for (int i = 0; i < 3; i++) {
      printPage(autoExampleAdvancedServiceApi.secondaryCacheTest(useSecondaryCacheDto));
    }
  }

  /**
   * 一级缓存、二级缓存、不使用AutoExample，三者性能对比测试
   * 运行完翻到日志最底下，可以看到 性能对比表格
   * 当然这个性能对比不是很严谨，仅做参考
   * @throws Exception
   */
  @Test
  //@Ignore//若想运行本测试，将@Ignore注释掉
  public void test5() throws Exception {
    AndEqualToDto andEqualToDto = new AndEqualToDto();
    andEqualToDto.setName("granary");
    andEqualToDto.setType(ResourceType.MODULE);

    UseSecondaryCacheDto useSecondaryCacheDto = new UseSecondaryCacheDto();
    useSecondaryCacheDto.setName("granary");
    useSecondaryCacheDto.setType(ResourceType.MODULE);

    NormalDto normalDto = new NormalDto();
    normalDto.setName("granary");
    normalDto.setType(ResourceType.MODULE);


    int count = 1001;
    ArrayList<Long> list1 = new ArrayList<>();
    ArrayList<Long> list2 = new ArrayList<>();
    ArrayList<Long> list3 = new ArrayList<>();
    ArrayList<Integer> countList = new ArrayList<>();


    for (int j = 200; j < count; j += 200) {
      countList.add(j);

      long s1 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        autoExampleBasicServiceApi.simpleAndEqualToTest(andEqualToDto);
      }
      long duration1 = System.currentTimeMillis() - s1;
      list1.add(duration1);

      long s2 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        autoExampleAdvancedServiceApi.secondaryCacheTest(useSecondaryCacheDto);
      }
      long duration2 = System.currentTimeMillis() - s2;
      list2.add(duration2);

      long s3 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        autoExampleAdvancedServiceApi.normalTest(normalDto);
      }
      long duration3 = System.currentTimeMillis() - s3;
      list3.add(duration3);

    }

    System.out.printf("%6s %6s %6s %6s %7s %7s %7s\n","请求数","一级缓存耗时","二级缓存耗时","普通查询耗时","一级缓存qps","二级缓存qps","普通查询qps");
    for (int i = 0; i < list1.size(); i++) {
      Integer c = countList.get(i);
      Long d1 = list1.get(i);
      Long d2 = list2.get(i);
      Long d3 = list3.get(i);
      System.out.printf("%8d %8d %8d %12d %12.2f %10.2f %10.2f\n", c,d1,d2,d3,c*1000f/d1,c*1000f/d2,c*1000f/d3);
    }
  }

  @Test
  public void test6() throws Exception {
    OrEqualToDto orEqualToDto = new OrEqualToDto();
    orEqualToDto.setName("granary");
    orEqualToDto.setType(ResourceType.RESOURCE_ID);
    printPage(autoExampleAdvancedServiceApi.simpleCompatibleWithPageHelperTest(orEqualToDto));
  }

  @Test
  public void test7() throws Exception {
    ManyEqualToDto manyEqualToDto = new ManyEqualToDto();
    manyEqualToDto.setName("granary");
    manyEqualToDto.setType(ResourceType.MODULE);
    manyEqualToDto.setOwnerEmail("adam@gmail.com");
    manyEqualToDto.setOwnerId(146);
    manyEqualToDto.setChineseName("granary");
    printPage(autoExampleAdvancedServiceApi.simpleManyEqualToTest(manyEqualToDto));
  }

  @Test
  public void test8() throws Exception {
    NormalManyEqualToDto manyEqualToDto = new NormalManyEqualToDto();
    manyEqualToDto.setName("granary");
    manyEqualToDto.setType(ResourceType.MODULE);
    manyEqualToDto.setOwnerEmail("adam@gmail.com");
    manyEqualToDto.setOwnerId(146);
    manyEqualToDto.setChineseName("granary");
    printPage(autoExampleAdvancedServiceApi.simpleNormalManyEqualToTest(manyEqualToDto));
  }

}
