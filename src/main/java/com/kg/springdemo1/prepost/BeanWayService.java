package com.kg.springdemo1.prepost;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-20:32
 */
public class BeanWayService {

    public void init() {
        System.out.println("bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数bean-construct");
    }

    public void destroy() {
        System.out.println("bean-destroy-method");
    }
}
