package com.smp.bill.common.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @ClassName: MybatisPlusConfig
 * @Description: mybatis-plus配置类
 * @Author: dufei
 * @Date: Created in 2019/11/11 22:51
 * @Version: 1.0.0
 **/

@Configuration
public class MybatisPlusConfig {

    /* *
     * @description: 注册分页插件PageHelper
     * @author: dufei
     * @date: 2019/11/10 1:21
     * @param
     * @return: com.github.pagehelper.PageHelper
     */
    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
