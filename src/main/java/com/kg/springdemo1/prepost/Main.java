package com.kg.springdemo1.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-20:48
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
