package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * 注意注入mapper
 */
@SpringBootApplication
@ComponentScan({"com.river.**"})
@MapperScan({"com.river.mapper"})
@EnableCaching
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}
}
