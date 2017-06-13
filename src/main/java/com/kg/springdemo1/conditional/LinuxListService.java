package com.kg.springdemo1.conditional;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-22:45
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
