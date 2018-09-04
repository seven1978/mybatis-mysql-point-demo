package com.dongnaoedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.dongnaoedu.mapper")
@EnableScheduling
public class MybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
        System.out.println("教学目的：建议直接复制相关代码，在项目中根据需求自定义实现。");
    }

}
