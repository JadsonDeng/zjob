package com.jadson.zjob;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jadson.zjob.dao.mapper")
public class ZjobBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjobBackendApplication.class, args);
    }

}
