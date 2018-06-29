package com.wangde007.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wangde007.mapper")
public class MainController{

    public static void main(String[] args) {
        SpringApplication.run(com.wangde007.controller.MainController.class, args);
    }
}