package com.itheima.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.itheima.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
