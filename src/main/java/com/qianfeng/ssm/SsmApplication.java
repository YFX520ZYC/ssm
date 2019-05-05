package com.qianfeng.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.qianfeng.ssm.dao")
public class SsmApplication {

	public static void main(String[] args) {

		SpringApplication.run(SsmApplication.class, args);
	}

}
