package com.sdydj.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sdydj.user.mapper")
public class SdydjUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdydjUserServiceApplication.class, args);
    }

}
