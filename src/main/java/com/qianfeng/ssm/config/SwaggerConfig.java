package com.qianfeng.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author Ceg
 *@Date Created in 2019/4/28 17:56
 */
@Configuration
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("时光记").
                description("打造一个你的回忆").
                contact(new Contact("cyx","http://1000phone.com","1467701699@qq.com")).build();
    }
    @Bean  //等价于 <bean>标签
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.qianfeng.ssm.controller")).build();
    }
}
