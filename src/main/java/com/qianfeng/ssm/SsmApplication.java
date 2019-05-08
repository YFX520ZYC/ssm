package com.qianfeng.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication   //Spring Boot项目的核心注解，主要目的是开启自动配置
@MapperScan("com.qianfeng.ssm.dao")
@EnableSwagger2
@ServletComponentScan("com.qianfeng.ssm.config")
//web应用的加载入口
public class SsmApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SsmApplication.class, args);
	}

	@Override//为了打包springboot项目
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}
