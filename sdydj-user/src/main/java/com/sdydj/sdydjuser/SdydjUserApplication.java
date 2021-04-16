package com.sdydj.sdydjuser;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.sdydj.sdydjuser.mapper")
public class SdydjUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdydjUserApplication.class, args);
    }

}
