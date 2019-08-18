package com.fengxiao.auto.example;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author hujun1
 * @date 2019-08-17 10:20
 */
public class BasicFunctionTests extends BaseTests {

  @Test
  public void test1() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/equal/to", paramStr);
  }

  @Test
  public void test2() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/equal/to", paramStr);
  }

  @Test
  public void test3() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/like", paramStr);
  }

  @Test
  public void test4() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/like", paramStr);

  }

  @Test
  public void test5() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/in", paramStr);
  }

  @Test
  public void test6() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/in", paramStr);
  }

  @Test
  public void test7() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/greater/than", paramStr);
  }

  @Test
  public void test8() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/greater/than", paramStr);
  }

  @Test
  public void test9() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/greater/than/or/equal/to", paramStr);
  }

  @Test
  public void test10() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name", "testbymiles14");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/greater/than/or/equal/to", paramStr);
  }

  @Test
  public void test11() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/less/than", paramStr);
  }

  @Test
  public void test12() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name", "testbymiles14");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/less/than", paramStr);
  }

  @Test
  public void test13() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/less/than/or/equal/to", paramStr);
  }

  @Test
  public void test14() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name", "testbymiles14");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/less/than/or/equal/to", paramStr);
  }

  @Test
  public void test15() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/is/not/null", paramStr);
  }

  @Test
  public void test16() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/is/not/null", paramStr);
  }

  @Test
  public void test17() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/is/null", paramStr);
  }

  @Test
  public void test18() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/is/null", paramStr);
  }

  @Test
  public void test19() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/not/like", paramStr);
  }

  @Test
  public void test20() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/not/like", paramStr);
  }

  @Test
  public void test21() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/not/in", paramStr);
  }

  @Test
  public void test22() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/not/in", paramStr);
  }

  @Test
  public void test23() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/and/not/equal/to", paramStr);
  }

  @Test
  public void test24() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/or/not/equal/to", paramStr);
  }

  @Test
  public void test25() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    for (int i = 0; i < 3; i++) {
      executeTest("/test/select/one", paramStr);
    }
  }

  @Test
  public void test26() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    for (int i = 0; i < 3; i++) {
      executeTest("/test/select/count", paramStr);
    }
  }

  @Test
  public void test27() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    param.put("chineseName", "Hello Miles2!");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/update/by/example/selective", paramStr);

  }

  @Test
  public void test28() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles12");
    param.put("type", "MODULE");
    String paramStr = JSONObject.toJSONString(param);

    executeTest("/test/delete/by/example", paramStr);

  }
}
