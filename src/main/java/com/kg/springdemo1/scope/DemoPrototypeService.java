package com.kg.springdemo1.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-17:49
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
