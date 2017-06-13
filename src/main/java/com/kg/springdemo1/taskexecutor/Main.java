package com.kg.springdemo1.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:18
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i <= 10; i++) {
            asyncTaskService.execAsyncTask(i);
            asyncTaskService.execAsyncTaskPlus(i);
        }

        System.out.println("ceshiyige~~~");

        context.close();
    }
}
