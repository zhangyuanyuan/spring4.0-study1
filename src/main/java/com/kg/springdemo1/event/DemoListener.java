package com.kg.springdemo1.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-21:29
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("listener接收到了event的消息：" + msg);
    }
}
