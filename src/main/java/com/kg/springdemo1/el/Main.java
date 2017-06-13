package com.kg.springdemo1.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-20:01
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);

        ElConfig elConfig = context.getBean(ElConfig.class);

        elConfig.output();

        context.close();
    }
}
