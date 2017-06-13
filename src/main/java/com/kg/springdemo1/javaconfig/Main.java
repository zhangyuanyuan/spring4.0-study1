package com.kg.springdemo1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-16:39
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("java config"));

        context.close();
    }
}
