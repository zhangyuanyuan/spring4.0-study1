package com.kg.springdemo1.javaconfig;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-16:25
 */
public class UserFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
