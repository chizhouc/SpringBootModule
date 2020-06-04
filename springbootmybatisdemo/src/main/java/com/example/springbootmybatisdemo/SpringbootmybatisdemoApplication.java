package com.example.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisdemo.mapper") // 使用MapperScan批量扫描所有的Mapper接口；
public class SpringbootmybatisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisdemoApplication.class, args);
    }

}
