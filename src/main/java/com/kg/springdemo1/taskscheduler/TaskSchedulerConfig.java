package com.kg.springdemo1.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:30
 */
@Configuration
@ComponentScan("com.kg.springdemo1.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
