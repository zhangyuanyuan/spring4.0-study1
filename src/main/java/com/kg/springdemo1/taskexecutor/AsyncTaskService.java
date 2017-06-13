package com.kg.springdemo1.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:15
 */
@Service
public class AsyncTaskService {

    @Async
    public void execAsyncTask(Integer i) {
        System.out.println("异步执行：" + i);
    }

    @Async
    public void execAsyncTaskPlus(Integer i) {
        System.out.println("异步执行+1：" + (i + 1));
    }
}
