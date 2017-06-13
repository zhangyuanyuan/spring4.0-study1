package com.kg.springdemo1.combineanno;

import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-23:01
 */
@Service
public class DemoService {

    public void output() {
        System.out.println("测试组合注解~~");
    }
}
