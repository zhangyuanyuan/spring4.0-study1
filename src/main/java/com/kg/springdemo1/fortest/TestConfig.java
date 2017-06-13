package com.kg.springdemo1.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-23:19
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev test bean");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("prod test bean");
    }
}
