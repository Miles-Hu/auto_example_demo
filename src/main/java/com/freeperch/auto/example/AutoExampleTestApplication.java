package com.freeperch.auto.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.freeperch.auto.example.dao")
public class AutoExampleTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(AutoExampleTestApplication.class, args);
  }

}
