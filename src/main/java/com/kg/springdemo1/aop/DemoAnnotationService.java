package com.kg.springdemo1.aop;

import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-17:15
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解拦截~~")
    public void add() {}
}
