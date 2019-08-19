package com.fengxiao.auto.example;

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
    executeTest("/test/and/equal/to", param);

    param.put("type", "MODULE");
    param.put("name", "");
    executeTest("/test/and/equal/to", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/equal/to", param);
  }

  @Test
  public void test2() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/or/equal/to", param);

    param.put("name","");
    param.put("type", "MODULE");
    executeTest("/test/or/equal/to", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/equal/to", param);
  }

  @Test
  public void test3() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/and/like", param);

    param.put("name","");
    param.put("type", "MODULE");
    executeTest("/test/and/like", param);

    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    executeTest("/test/and/like", param);
  }

  @Test
  public void test4() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/or/like", param);

    param.put("name","");
    param.put("type", "MODULE");
    executeTest("/test/or/like", param);

    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    executeTest("/test/or/like", param);

  }

  @Test
  public void test5() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/and/in", param);

    param.put("name","");
    ArrayList<String> s = new ArrayList<>();
    param.put("type", s);
    executeTest("/test/and/in", param);

    param.put("name","testbymiles14");
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    executeTest("/test/and/in", param);
  }

  @Test
  public void test6() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/or/in", param);

    param.put("name","");
    ArrayList<String> s = new ArrayList<>();
    param.put("type", s);
    executeTest("/test/or/in", param);

    param.put("name","testbymiles14");
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    executeTest("/test/or/in", param);
  }

  @Test
  public void test7() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/and/greater/than", param);

    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/and/greater/than", param);

    param.put("name", "testbymiles14");
    executeTest("/test/and/greater/than", param);
  }

  @Test
  public void test8() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/or/greater/than", param);

    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/or/greater/than", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/greater/than", param);
  }

  @Test
  public void test9() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/and/greater/than/or/equal/to", param);

    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/and/greater/than/or/equal/to", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/greater/than/or/equal/to", param);
  }

  @Test
  public void test10() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/or/greater/than/or/equal/to", param);

    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/or/greater/than/or/equal/to", param);

    param.put("name", "testbymiles14");
    executeTest("/test/or/greater/than/or/equal/to", param);
  }

  @Test
  public void test11() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/and/less/than", param);

    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/and/less/than", param);

    param.put("name", "testbymiles14");
    executeTest("/test/and/less/than", param);
  }

  @Test
  public void test12() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/or/less/than", param);

    param.put("name", "");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/or/less/than", param);

    param.put("name", "testbymiles14");
    executeTest("/test/or/less/than", param);
  }

  @Test
  public void test13() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/and/less/than/or/equal/to", param);

    param.put("name", "");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/and/less/than/or/equal/to", param);

    param.put("name", "testbymiles14");
    executeTest("/test/and/less/than/or/equal/to", param);
  }

  @Test
  public void test14() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("createTime", null);
    executeTest("/test/or/less/than/or/equal/to", param);

    param.put("name", "");
    Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 20:50:28").getTime();
    param.put("createTime", time);
    executeTest("/test/or/less/than/or/equal/to", param);

    param.put("name", "testbymiles14");
    executeTest("/test/or/less/than/or/equal/to", param);
  }

  @Test
  public void test15() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/and/is/not/null", param);

    param.put("name","");
    executeTest("/test/and/is/not/null", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/is/not/null", param);
  }

  @Test
  public void test16() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/or/is/not/null", param);

    param.put("name","");
    executeTest("/test/or/is/not/null", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/is/not/null", param);
  }

  @Test
  public void test17() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/and/is/null", param);

    param.put("name","");
    executeTest("/test/and/is/null", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/is/null", param);
  }

  @Test
  public void test18() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/or/is/null", param);

    param.put("name","");
    executeTest("/test/or/is/null", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/is/null", param);
  }

  @Test
  public void test19() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","");
    executeTest("/test/and/not/like", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/not/like", param);

    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    executeTest("/test/and/not/like", param);

  }

  @Test
  public void test20() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/or/not/like", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/not/like", param);

    param.put("type", "MODULE");
    executeTest("/test/or/not/like", param);
  }

  @Test
  public void test21() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    param.put("type", s);
    executeTest("/test/and/not/in", param);

    param.put("name","");
    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    executeTest("/test/and/not/in", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/not/in", param);
  }

  @Test
  public void test22() throws Exception {
    HashMap<String, Object> param = new HashMap<>();
    executeTest("/test/or/not/in", param);

    param.put("name","testbymiles14");
    ArrayList<String> s = new ArrayList<>();
    param.put("type", s);
    executeTest("/test/or/not/in", param);

    s.add("MODULE");
    s.add("RESOURCE_TYPE");
    param.put("type", s);
    executeTest("/test/or/not/in", param);
  }

  @Test
  public void test23() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","");
    executeTest("/test/and/not/equal/to", param);

    param.put("name","testbymiles14");
    executeTest("/test/and/not/equal/to", param);

    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    executeTest("/test/and/not/equal/to", param);
  }

  @Test
  public void test24() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","");
    executeTest("/test/or/not/equal/to", param);

    param.put("name","testbymiles14");
    executeTest("/test/or/not/equal/to", param);

    param.put("type", "MODULE");
    executeTest("/test/or/not/equal/to", param);
  }

  @Test
  public void test25() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    executeTest("/test/select/one", param);

    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    executeTest("/test/select/one", param);
  }

  @Test
  public void test26() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    executeTest("/test/select/count", param);

    param.put("type", "MODULE");
    executeTest("/test/select/count", param);

    param.put("name","testbymiles14");
    executeTest("/test/select/count", param);
  }

  @Test
  public void test27() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles14");
    param.put("type", "MODULE");
    param.put("chineseName", "Hello Miles3!");
    executeTest("/test/update/by/example/selective", param);

    param.put("name","");
    param.put("type", "MODULE");
    param.put("chineseName", "Hello Miles3!");
    executeTest("/test/update/by/example/selective", param);
  }

  @Test
  public void test28() throws Exception {
    HashMap<String, String> param = new HashMap<>();
    param.put("name","testbymiles12");
    param.put("type", "MODULE");
    executeTest("/test/delete/by/example", param);

  }
}
