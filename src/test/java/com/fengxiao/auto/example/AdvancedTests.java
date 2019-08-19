package com.fengxiao.auto.example;

import org.junit.Ignore;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author hujun1
 * @date 2019-08-17 13:20
 */
public class AdvancedTests extends BaseTests {

  @Test
  public void test1() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    List<String> types = new ArrayList<>();
    param.put("type", types);
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/advanced/criteria/multi", param);

    types.add("MODULE");
    executeTest("/test/advanced/criteria/multi", param);
  }

  @Test
  public void test2() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    List<String> types = new ArrayList<>();
    param.put("type", types);
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/advanced/order/by", param);

    param.put("name","");
    types.add("MODULE");
    executeTest("/test/advanced/order/by", param);
  }

  @Test
  public void test3() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    List<String> types = new ArrayList<>();
    param.put("type", types);
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/advanced/distinct", param);


    types.add("MODULE");
    executeTest("/test/advanced/distinct", param);
  }


  @Test
  public void test4() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    for (int i = 0; i < 3; i++) {
      executeTest("/test/advanced/secondary/cache", param);
    }
  }

  /**
   * 一级缓存、二级缓存、不使用AutoExample，三者性能对比测试
   * 运行完翻到日志最底下，可以看到 性能对比表格
   * 若想运行本测试，将@Ignore注释掉
   * @throws Exception
   */
  @Test
  @Ignore
  public void test5() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");

    int count = 1001;
    ArrayList<Long> list1 = new ArrayList<>();
    ArrayList<Long> list2 = new ArrayList<>();
    ArrayList<Long> list3 = new ArrayList<>();
    ArrayList<Integer> countList = new ArrayList<>();


    for (int j = 200; j < count; j += 200) {
      countList.add(j);

      long s1 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        executeTest("/test/and/equal/to", param);
      }
      long duration1 = System.currentTimeMillis() - s1;
      list1.add(duration1);

      long s2 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        executeTest("/test/advanced/secondary/cache", param);
      }
      long duration2 = System.currentTimeMillis() - s2;
      list2.add(duration2);

      long s3 = System.currentTimeMillis();
      for (int i = 0; i < j; i++) {
        executeTest("/test/advanced/normal", param);
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
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles13");
    param.put("type", "MODULE");
    executeTest("/test/advanced/compatible/with/page/helper", param);

  }

  @Test
  public void test7() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    param.put("ownerId", 1);
    param.put("ownerEmail", "abc@gmail.com");
    param.put("chineseName", "");

    executeTest("/test/advanced/present/many/equal/to", param);

    param.put("chineseName", "aaa");
    executeTest("/test/advanced/present/many/equal/to", param);


  }

  @Test
  public void test8() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    param.put("ownerId", 1);
    param.put("ownerEmail", "abc@gmail.com");
    executeTest("/test/advanced/present/normal/many/equal/to", param);

  }

}
