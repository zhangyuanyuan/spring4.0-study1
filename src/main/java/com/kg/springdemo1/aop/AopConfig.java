package com.kg.springdemo1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-17:27
 */
@Configuration
@ComponentScan(value = {"com.kg.springdemo1.aop"})
@EnableAspectJAutoProxy
public class AopConfig {

}
