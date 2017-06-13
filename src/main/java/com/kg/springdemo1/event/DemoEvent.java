package com.kg.springdemo1.event;

import org.springframework.context.ApplicationEvent;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-21:26
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
