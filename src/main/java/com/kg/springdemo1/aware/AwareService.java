package com.kg.springdemo1.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-21:59
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void output() {
        System.out.println("beanName is :" + this.beanName);

        Resource resource = this.resourceLoader.getResource("classpath:aware/test.txt");

        try {
            System.out.println("load resource is "+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
