package com.kg.springdemo1.annotation;

import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-16:24
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "hello :" + word;
    }
}
