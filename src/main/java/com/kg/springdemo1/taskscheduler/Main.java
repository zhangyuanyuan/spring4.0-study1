package com.kg.springdemo1.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:31
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
