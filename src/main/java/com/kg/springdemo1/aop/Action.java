package com.kg.springdemo1.aop;

import java.lang.annotation.*;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-17:12
 */
@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
