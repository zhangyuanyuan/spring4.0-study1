package com.kg.springdemo1.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-20:35
 */
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数jsr250-bean-construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
