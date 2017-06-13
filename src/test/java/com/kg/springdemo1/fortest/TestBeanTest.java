package com.kg.springdemo1.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-13-23:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class TestBeanTest {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodTestBeanWillMount() {
        assertEquals("prod test bean", testBean.getContent());
    }
}