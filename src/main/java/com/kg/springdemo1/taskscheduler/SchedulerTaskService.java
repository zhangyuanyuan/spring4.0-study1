package com.kg.springdemo1.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:25
 */
@Service
public class SchedulerTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurentTime() {
        System.out.println("每5s执行一次：" + sdf.format(new Date()));
    }

    @Scheduled(cron = "0 */1 * * * *")
    public void fixTimeExecution() {
        System.out.println("固定时间执行：" + sdf.format(new Date()));
    }
}
