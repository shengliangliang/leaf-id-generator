package com.leaf.id.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leaf.id.generator.dao.mapper")
public class LeafIdGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafIdGeneratorApplication.class, args);
    }

}
