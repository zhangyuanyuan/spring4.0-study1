package com.kg.springdemo1.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-17:52
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingleService s1 = context.getBean(DemoSingleService.class);
        DemoSingleService s2 = context.getBean(DemoSingleService.class);

        System.out.println(s1.equals(s2) ? "single is same" : "single is not same");

        DemoPrototypeService s3 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService s4 = context.getBean(DemoPrototypeService.class);
        System.out.println(s3.equals(s4) ? "prototype is same" : "prototype is not same");

        context.close();
    }
}
