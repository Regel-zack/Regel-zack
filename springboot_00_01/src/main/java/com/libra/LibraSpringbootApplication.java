package com.libra;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("dao")
public class LibraSpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(LibraSpringbootApplication.class, args);
    }

}
