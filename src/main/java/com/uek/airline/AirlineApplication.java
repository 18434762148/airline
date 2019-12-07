package com.uek.airline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.uek.airline.mapper"})
public class AirlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirlineApplication.class, args);
    }

}
