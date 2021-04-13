package com.halo.admin;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;


/**
 * @author Halo
 * @date Created in 2021/04/13 9:38 PM
 * @description
 */
@SpringBootApplication()
@MapperScan("com.halo.general.mapper*")
@ComponentScan(basePackages = {
        "com.halo.admin",
        "com.halo.general.service",
})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
