package com.smp.bill.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: SwaggerConfig
 * @Description: Swagger配置类
 * @Author: dufei
 * @Date: Created in 2019/11/11 22:52
 * @Version: 1.0.0
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String VERSION = "1.0";
    public static final String AUTHOR = "dufei";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("基础模块")
                .select()
                //加了ApiOperation注解的方法，生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.smp.bill.controller"))
                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.any())
                .build()
                .ignoredParameterTypes(ApiIgnore.class)
                .enableUrlTemplating(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档的标题
                .title("API文档")
                //设置文档的描述
                .description("mybatis-plus项目API文档")
                .termsOfServiceUrl("https://github.com/constlovefly")
                //设置文档的版本信息
                .version(VERSION)
                //作者信息
                .contact(new Contact(AUTHOR, "https://github.com/constlovefly", "6466761@qq.com"))
                //设置文档的License信息
                .termsOfServiceUrl("no term url")
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

}
