package com.bigboss.spring.shema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jerry
 * @version 1.0
 * @description 启动类
 * @Date 2019/12/19 15:43
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class,args);
    }

}
