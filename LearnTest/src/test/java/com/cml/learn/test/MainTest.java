package com.cml.learn.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class MainTest {

    @Before
    public void before() {
        System.out.println("start=============");
    }

    @Test
    public void testStartUp() {
        System.out.println("--------------测试----------");
    }
}
