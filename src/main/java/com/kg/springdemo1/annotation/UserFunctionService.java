package com.kg.springdemo1.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-16:25
 */
@Service
public class UserFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
